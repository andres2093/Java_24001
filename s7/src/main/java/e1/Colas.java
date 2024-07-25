package e1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        Queue<String> cola = new PriorityQueue<>();
        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");
        cola.add("cinco");

        for (String s : cola) {
            System.out.print(s + " | ");
        }
        System.out.println();
        String valor;
        while ((valor = cola.poll()) != null){
            System.out.print(valor + " | ");
        }

        Queue<Libro> libros = new PriorityQueue<>();
        libros.add(new Libro("uno", 9));
        libros.add(new Libro("dos", 2));
        libros.add(new Libro("tres", 3));
        libros.add(new Libro("cuatro", 6));
        libros.add(new Libro("cinco", 5));
        libros.add(new Libro("seis", 4));
        libros.add(new Libro("siete", 7));
        libros.add(new Libro("ocho", 8));
        libros.add(new Libro("nueve", 1));

        System.out.println();
        Libro libro;
        while ((libro = libros.poll()) != null){
            System.out.print(libro.getTitulo() + " | ");
        }
    }
}
