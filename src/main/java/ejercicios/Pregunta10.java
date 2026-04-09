package ejercicios;

//Escribe un programa que imprima una pirámide de asterisco

public class Pregunta10 {

    public static void main(String[] args) {
        int filas = 4;
        imprimirPiramide(filas);
    }

    public static void imprimirPiramide(int filas) {
        if (filas <= 0) {
            System.out.println("El numero de filas debe ser mayor a 0");
            return;
        }

        for (int fila = 1; fila <= filas; fila++) {
            imprimirEspacios(filas - fila);
            imprimirAsteriscos((2 * fila) - 1);
            System.out.println();
        }
    }

    public static void imprimirEspacios(int cantidadEspacios) {
        for (int i = 0; i < cantidadEspacios; i++) {
            System.out.print(" ");
        }
    }

    public static void imprimirAsteriscos(int cantidadAsteriscos) {
        for (int i = 0; i < cantidadAsteriscos; i++) {
            System.out.print("*");
        }
    }
}
