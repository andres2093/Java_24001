package e2;

import java.time.LocalDate;

public class ProfesorInterino extends Persona{
    private LocalDate fechaTerminacion;

    public ProfesorInterino(String nombre, String apellidos, LocalDate fechaTerminacion) {
        super(nombre, apellidos);
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ProfesorInterino(Fecha: " + fechaTerminacion + ")");
    }
}
