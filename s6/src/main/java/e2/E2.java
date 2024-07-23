package e2;

import java.time.LocalDate;
import java.time.Month;

public class E2 {
    public static void main(String[] args) {
        Profesor profesor = new Profesor(
                "Beto",
                "Bedu",
                "001"
        );

        profesor.mostrarDatos();

        ProfesorInterino profesorInterino = new ProfesorInterino(
                "Andrés",
                "Ramiréz",
                LocalDate.of(2024, Month.DECEMBER, 30)
        );

        profesorInterino.mostrarDatos();
    }
}
