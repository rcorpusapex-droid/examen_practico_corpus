package ejercicios;

//Escribe un fragmento de código Java que demuestre el uso de un arreglo para almacenar los días de la semana.
// Imprime el arreglo de lunes a viernes y en reversa.

public class Pregunta4 {

    public static void main(String[] args) {
        String[] diasSemana = obtenerDiasSemana();

        imprimirDiasHabiles(diasSemana);
        imprimirDiasHabilesEnReversa(diasSemana);
    }

    public static String[] obtenerDiasSemana() {
        return new String[] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
        };
    }

    public static void imprimirDiasHabiles(String[] diasSemana) {
        System.out.println("Dias de lunes a viernes:");

        for (int i = 0; i < 5; i++) {
            System.out.println(diasSemana[i]);
        }
    }

    public static void imprimirDiasHabilesEnReversa(String[] diasSemana) {
        System.out.println("Dias de lunes a viernes en reversa:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(diasSemana[i]);
        }
    }
}
