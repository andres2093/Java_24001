package e2;

import java.io.*;

public class Texto {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/archivo.txt"));
            bw.write("Esta es la primer línea de mi documento");
            bw.newLine();
            bw.write("Esta es la segunda línea de mi documento\n");
            bw.write("Esta es la tercera línea de mi documento");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + "/archivo.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("El archivo no existe: " + e.getMessage());
        }
    }
}
