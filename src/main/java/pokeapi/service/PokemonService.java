package pokeapi.service;

import com.google.gson.Gson;
import pokeapi.model.Pokemon;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class PokemonService {

    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";
    private final HttpClient httpClient;
    private final Gson gson;

    public PokemonService() {
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        this.gson = new Gson();
    }

    public Pokemon buscarPokemonPorNombre(String nombrePokemon) throws IOException, InterruptedException {
        validarNombrePokemon(nombrePokemon);

        String nombreNormalizado = nombrePokemon.trim().toLowerCase();
        String nombreCodificado = URLEncoder.encode(nombreNormalizado, StandardCharsets.UTF_8);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + nombreCodificado))
                .timeout(Duration.ofSeconds(10))
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        int statusCode = response.statusCode();

        if (statusCode == 200) {
            return gson.fromJson(response.body(), Pokemon.class);
        }

        if (statusCode == 404) {
            throw new IllegalArgumentException("No se encontró el pokemon: " + nombrePokemon);
        }

        throw new IOException("Error en la petición. Código HTTP: " + statusCode);
    }

    private void validarNombrePokemon(String nombrePokemon) {
        if (nombrePokemon == null || nombrePokemon.trim().isEmpty()) {
            throw new IllegalArgumentException("Debes ingresar un nombre de pokemon válido");
        }
    }
}
