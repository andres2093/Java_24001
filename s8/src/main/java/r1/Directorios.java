package r1;

import java.io.File;

public class Directorios {
    public static void main(String[] args) {
        muestraContenidoDirectorio(new File("/home/andres/Documentos/Revisiones/JavaSE/s8"));
    }

    private static void muestraContenidoDirectorio(File directorio) {
        colocaEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());

        for (File file : directorio.listFiles()) {
            if (file.isFile()) {
                colocaEspacios(file.getParent(), 'A');
                System.out.println(file.getName());
            } else if (file.isDirectory()){
                muestraContenidoDirectorio(file);
            }
        }
    }

    private static void colocaEspacios(String directorioPadre, char simbolo) {
        System.out.print("[" + simbolo + "]");
        for (int i = 0; i < directorioPadre.length(); i++) {
            System.out.print("-");
        }
    }
}
