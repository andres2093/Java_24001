package e2;

public class Persona implements Comparable<Persona>{
    private final String nombre, apellido;
    private float estatura;

    public Persona(String nombre, String apellido, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getEstatura() {
        return estatura;
    }

    public String mostrarDatos(){
        return nombre + " " + apellido + ": " + estatura;
    }

    @Override
    public int compareTo(Persona persona) {
        return Float.compare(this.estatura, persona.getEstatura());
    }
}
