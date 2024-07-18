package r2;

import java.time.LocalDate;
import java.time.Month;

public class R2 {
    public static void main(String[] args) {
        Programador p = new Programador(
                "Ben", (byte) 37, LocalDate.of(1982, Month.APRIL, 4),
                77435F, "Java");
        DBA d = new DBA("Jack", (byte) 28, LocalDate.of(1993, Month.JANUARY, 21),
                45000F, "My SQL");

        System.out.println("\n====Datos del programador====");
        System.out.print("Nombre: " + p.getNombre());
        System.out.print(", Edad: " + p.getEdad());
        System.out.print(", Fecha nacimiento: " + p.getFechaNacimiento());
        System.out.print(", Salario: " + p.getSalario());
        System.out.print(", Lenguaje: " + p.getLenguajePrincipal());

        System.out.println("\n====Datos del DBA====");
        System.out.print("Nombre: " + d.getNombre());
        System.out.print(", Edad: " + d.getEdad());
        System.out.print(", Fecha nacimiento: " + d.getFechaNacimiento());
        System.out.print(", Salario: " + d.getSalario());
        System.out.print(", Herramiena: " + d.getHerramientaConsultas());

    }
}