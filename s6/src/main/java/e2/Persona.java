package e2;

public abstract class Persona {

    private String nombre, apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void mostrarDatos(){
        System.out.println("Persona(Nombre: " + nombre + ", Apellidos: " + apellidos + ")");
    }
}
