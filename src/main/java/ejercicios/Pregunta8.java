package ejercicios;

import java.util.Scanner;

// Define una interfaz llamada Figura con un método abstracto calcularPerimetro.
// Luego, implementa esta interfaz en las clases Circulo y Cuadrado,
// proporcionando la lógica adecuada para calcular el perímetro de cada figura.

interface Figura {
    double calcularPerimetro();
}

class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor a 0");
        }
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor a 0");
        }
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

public class Pregunta8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radio = leerValorPositivo(scanner, "Ingresa el radio del circulo: ");
        double lado = leerValorPositivo(scanner, "Ingresa el lado del cuadrado: ");

        Figura circulo = new Circulo(radio);
        Figura cuadrado = new Cuadrado(lado);

        System.out.println();
        imprimirPerimetro("Circulo", circulo);
        imprimirPerimetro("Cuadrado", cuadrado);

        scanner.close();
    }

    public static double leerValorPositivo(Scanner scanner, String mensaje) {
        double valor;

        while (true) {
            System.out.print(mensaje);

            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();

                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Error: el valor debe ser mayor a 0.");
                }
            } else {
                System.out.println("Error: debes ingresar un numero valido.");
                scanner.next();
            }
        }
    }

    public static void imprimirPerimetro(String nombreFigura, Figura figura) {
        System.out.println("Perimetro del " + nombreFigura + ": " + figura.calcularPerimetro());
    }
}