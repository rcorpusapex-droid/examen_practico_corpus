package ejercicios;
//Explique el concepto de encapsulamiento en Java. 
// Proporciona un ejemplo de cómo usar los modificadores de acceso para lograr encapsulamiento en una clase

//R= El encapsulamiento consiste en proteger los datos de una clase para que no sean accedidos directamente desde fuera.
//  Para lograrlo, los atributos se declaran como private y se controla su acceso mediante métodos públicos, como getters y setters.

public final class Pregunta5 {
    private String nombre;
    private int edad;

    public Pregunta5(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

    public static void main(String[] args) {
        Pregunta5 persona = new Pregunta5("Carlos", 22);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        persona.setEdad(25);
        System.out.println("Nueva edad: " + persona.getEdad());
    }
}
