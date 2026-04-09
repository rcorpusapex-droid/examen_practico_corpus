package ejercicios;
//¿Cuál es la diferencia entre == y .equals() al comparar cadenas en Java?

//== compara si dos variables apuntan al mismo objeto en memoria.
//.equals() compara el contenido de las cadenas.

public class Pregunta6 {

    public static void main(String[] args) {
        String texto1 = new String("Hola");
        String texto2 = new String("Hola");

        compararCadenas(texto1, texto2);
    }

    public static void compararCadenas(String texto1, String texto2) {
        System.out.println("Comparacion con ==");
        System.out.println(texto1 == texto2);

        System.out.println("Comparacion con equals");
        System.out.println(texto1.equals(texto2));
    }
}
