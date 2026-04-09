package ejercicios;

import java.util.Scanner;

//Implementa un método en Java llamado invertirCadena que tome una cadena como parámetro y devuelva la cadena invertida. 
// Cadena ejemplo: Lorem ipsum dolor sit amet, consectetur adipiscing elit

public class Pregunta7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textoOriginal;

        do {
            System.out.print("Ingresa una cadena: ");
            textoOriginal = scanner.nextLine().trim();

            if (textoOriginal.isEmpty()) {
                System.out.println("Error: debes ingresar una cadena valida.");
            }
        } while (textoOriginal.isEmpty());

        String textoInvertido = invertirCadena(textoOriginal);

        System.out.println("\nTexto original:");
        System.out.println(textoOriginal);

        System.out.println("Texto invertido:");
        System.out.println(textoInvertido);

        scanner.close();
    }

    public static String invertirCadena(String texto) {
        StringBuilder textoInvertido = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido.append(texto.charAt(i));
        }

        return textoInvertido.toString();
    }
}
