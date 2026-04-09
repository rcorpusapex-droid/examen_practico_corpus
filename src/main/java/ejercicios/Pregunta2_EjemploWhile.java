package ejercicios;

// ¿Cuál es la diferencia entre un for y un while en Java? Proporciona un ejemplo de cada uno.
//R= La estructura while se utiliza cuando no necesariamente sabemos cuántas iteraciones habrá, 
// y la repetición depende de una condición.

public class Pregunta2_EjemploWhile {

    public static void main(String[] args) {
        imprimirConWhile(5);
    }

    public static void imprimirConWhile(int limite) {
        int contador = 1;

        while (contador <= limite) {
            System.out.println("Valor actual: " + contador);
            contador++;
        }
    }
}
