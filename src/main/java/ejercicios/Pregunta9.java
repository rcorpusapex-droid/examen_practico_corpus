package ejercicios;

import java.util.Scanner;

//Escribe un programa en Java que lea un número entero e imprima si es par o impar

public class Pregunta9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = leerNumero(scanner);
        mostrarResultado(numero);

        scanner.close();
    }

    public static int leerNumero(Scanner scanner) {
        while (true) {
            System.out.print("Ingresa un numero entero: ");

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Entrada invalida. Debes ingresar un numero entero.");
                scanner.next();
            }
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarResultado(int numero) {
        if (esPar(numero)) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
