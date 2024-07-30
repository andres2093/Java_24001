package e3;

import java.time.LocalDate;
import java.time.Month;

public class Formato {
    public static void main(String[] args) {
        final String NOMBRE = "Beto";
        final int EDAD = 23;
        final float PROMEDIO = 8.4F;
        final LocalDate FECHA = LocalDate.of(1996, Month.FEBRUARY, 21);

        System.out.println("Mi nombre es: " + NOMBRE + ", tengo " + EDAD + " años, mi promedio es " + PROMEDIO
                            + " y nací el " + FECHA);

        System.out.printf(
                "Mi nombre es: |%8s|, tengo %05d años|, mi promedio es %.2f y nací el %4$te de %4$tB de %4$tY",
                NOMBRE, EDAD, PROMEDIO, FECHA
        );

        final String NOMBRE_2 = "Carlos";
        final int EDAD_2 = 103;
        final float PROMEDIO_2 = 9.5F;
        final LocalDate FECHA_2 = LocalDate.of(2015, Month.FEBRUARY, 21);

        System.out.println();

        System.out.printf(
                "Mi nombre es: |%8s|, tengo %05d años|, mi promedio es %.2f y nací el %4$te de %4$tB de %4$tY",
                NOMBRE_2, EDAD_2, PROMEDIO_2, FECHA_2
        );

        System.out.println();
        System.out.println();

//        System.out.printf(
//                "|%8s| %05d | %.2f | ",
//                "NOMBRE", "EDAD", "PROMEDIO"
//        );

        System.out.printf(
                "|%8s| %05d | %.2f | %4$te de %4$tB de %4$tY |",
                NOMBRE, EDAD, PROMEDIO, FECHA
        );
        System.out.println();
        System.out.printf(
                "|%8s| %05d | %.2f | %4$te de %4$tB de %4$tY |",
                NOMBRE_2, EDAD_2, PROMEDIO_2, FECHA_2
        );
    }
}
