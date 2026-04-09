package pokeapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pokeapi.model.Pokemon;
import pokeapi.service.PokemonService;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController() {
        this.pokemonService = new PokemonService();
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<?> buscarPokemon(@PathVariable String nombre) {
        try {
            Pokemon pokemon = pokemonService.buscarPokemonPorNombre(nombre);
            return ResponseEntity.ok(pokemon);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(crearRespuestaError("No se encontró el pokemon o el nombre es inválido", e.getMessage()));
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY)
                    .body(crearRespuestaError("Error al consultar PokeAPI", e.getMessage()));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(crearRespuestaError("La operación fue interrumpida", e.getMessage()));
        }
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("status", "ok");
        response.put("message", "API local de Pokemon funcionando correctamente");
        return response;
    }

    private Map<String, String> crearRespuestaError(String error, String detalle) {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("error", error);
        response.put("detalle", detalle);
        return response;
    }
}
