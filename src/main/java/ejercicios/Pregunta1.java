package ejercicios;
// Escribe un programa en Java que imprima los números 
// del 1 al 10 en orden ascendente, separados por una coma: 1,2,3,4,5,6,7,8,9,10
public class Pregunta1 {

    public static void main(String[] args) {
        imprimirNumerosDelUnoAlDiez();
    }

    public static void imprimirNumerosDelUnoAlDiez() {
        StringBuilder resultado = new StringBuilder();

        for (int numero = 1; numero <= 10; numero++) {
            resultado.append(numero);

            if (numero < 10) {
                resultado.append(",");
            }
        }

        System.out.println(resultado);
    }
}
