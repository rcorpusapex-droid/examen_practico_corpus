package ejercicios;
//¿Cuál es la diferencia entre un for y un while en Java? Proporciona un ejemplo de cada uno.

//R= La estructura for se utiliza cuando conocemos desde el inicio cuántas veces se repetirá un bloque de código.
public class Pregunta2_EjemploFor {

    public static void main(String[] args) {
        imprimirConFor(5);
    }

    public static void imprimirConFor(int limite) {
        for (int contador = 1; contador <= limite; contador++) {
            System.out.println("Valor actual: " + contador);
        }
    }
}
