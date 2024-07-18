package e3;

public class E3 {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("Beto", "CDMX", 50);
        Equipo e2 = new Equipo("Bedu", "GDL", 55);
        Equipo e3 = new Equipo("Tech", "Cabos");
        Equipo e4 = new Equipo("Lobos");

        e1.imprimirDatos();
        e2.imprimirDatos();
        e3.imprimirDatos();
        e3.actualizar(e3.getNombre(), e3.getCiudad(), 40);
        e3.imprimirDatos();

        e4.imprimirDatos();
        e4.actualizar(e4.getNombre(), "Zapopan", 100);
        e4.imprimirDatos();
    }
}
