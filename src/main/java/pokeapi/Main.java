package pokeapi;

import pokeapi.model.Pokemon;
import pokeapi.service.PokemonService;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PokemonService pokemonService = new PokemonService();

        System.out.print("Ingresa el nombre del pokemon: ");
        String nombrePokemon = scanner.nextLine();

        try {
            Pokemon pokemon = pokemonService.buscarPokemonPorNombre(nombrePokemon);
            System.out.println();
            System.out.println(pokemon);
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de conexión o respuesta: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("La operación fue interrumpida");
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
