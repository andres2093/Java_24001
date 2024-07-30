package r2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Binario {
    public static void main(String[] args) {
        try {
//            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("beto.png"));
            BufferedInputStream bis = new BufferedInputStream(Files.newInputStream(Paths.get("beto.png")));
            BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(Paths.get("beto_copia.png")));

            byte[] buffer = new byte[1024];

            int bytesLeidos;
            while ((bytesLeidos = bis.read(buffer)) > 0){
                bos.write(buffer, 0, bytesLeidos);
            }

            bos.close();
            bis.close();
        } catch (IOException e){
            System.out.println("El archivo no existe: " + e.getMessage());
        }
    }
}
