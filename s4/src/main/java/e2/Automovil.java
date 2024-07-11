package e2;

public class Automovil {
    private String marca, modelo;
    private int anioFrabricacion, kilometraje;

    public Automovil(String marca, String modelo, int anioFrabricacion, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFrabricacion = anioFrabricacion;
        this.kilometraje = kilometraje;
    }

//    Añadirle funcionalidad propia a un método de JAVA ya definido
//    @Override
//    public int hashCode() {
//        System.out.println("solicitaron el hashCode");
//        return super.hashCode();
//    }

//    Reemplazar función predefinida en JAVA por la mia
    @Override
    public int hashCode() {
        System.out.println("");
        System.out.println("solicitaron el hashCode del " + modelo);
        int hash = 0;
        hash += marca.hashCode();
        hash += modelo.hashCode();
        hash += anioFrabricacion;
        hash += kilometraje;
        System.out.println("hashCode default " + super.hashCode());
        return hash;
    }
}
