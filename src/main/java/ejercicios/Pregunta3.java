package ejercicios;

import java.util.Scanner;

// Define una clase llamada Rectangulo con atributos base y altura.
// Agrega un método llamado calcularArea que devuelva el área del rectángulo.

public final class Pregunta3 {
    private double base;
    private double altura;

    public Pregunta3(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public double calcularArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            throw new IllegalArgumentException("La base debe ser mayor a 0");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("La altura debe ser mayor a 0");
        }
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = leerValorPositivo(scanner, "Ingresa la base del rectangulo: ");
        double altura = leerValorPositivo(scanner, "Ingresa la altura del rectangulo: ");

        Pregunta3 rectangulo = new Pregunta3(base, altura);

        System.out.println("\nDatos del rectangulo:");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Area: " + rectangulo.calcularArea());

        scanner.close();
    }
}