public class POO {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNombre("Beto");
        autor.setApellido("Bedu");
        autor.setEdad(8);

        Libro libro = new Libro();
        libro.setTitulo("Java SE");
        libro.setAutor(autor);
        libro.setNumeroPaginas(50);

        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
        System.out.println("Nombre libro: " + libro.getTitulo());
        System.out.println("Páginas: " + libro.getNumeroPaginas());
    }
}
