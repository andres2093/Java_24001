package e1;

import java.io.File;

public class Archivo {
    public static void main(String[] args) {
//        Windows
//        File file = new File("C:/temp/cursos/cursos.txt");
//        Mac & Linux
        File file = new File("/home/andres/cursos.txt");

        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta: " + file.getPath());
        System.out.println("Ruta relativa: " + file.getAbsolutePath());
        System.out.println("Padre: " + file.getParent());
        System.out.println("Existe: " + file.exists());
        System.out.println("Está oculto: " + file.isHidden());

        if (file.exists()) {
            System.out.println("Escribir: " + file.canWrite());
            System.out.println("Leer: " + file.canRead());
            System.out.println("Ejecutar: " + file.canExecute());
            System.out.println("Directorio: " + file.isDirectory());
            System.out.println("Tamaño en bytes: " + file.length());
        }
    }
}
