package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Andrés", "R", 1.79F);
        Persona persona2 = new Persona("Beto", "B", 1F);
        Persona persona3 = new Persona("Carlos", "C", 1.65F);
        Persona persona4 = new Persona("Issac", "S", 1.2F);
        Persona persona5 = new Persona("Lorena", "G", 1.66F);

        List<Persona> personas = new ArrayList<>();
        Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);
        Collections.sort(personas);
        for (Persona persona : personas) {
            System.out.println(persona.mostrarDatos());
        }
    }
}
