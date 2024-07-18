package e3;

public class Equipo {
    private String nombre, ciudad;
    private int puntos;

    public Equipo(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    public void actualizar(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public void actualizar(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirDatos(){
        System.out.println(nombre + " : " + ciudad + " - " + puntos);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPuntos() {
        return puntos;
    }
}
