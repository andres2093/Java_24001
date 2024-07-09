package e2;

public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe la palabra:");
        String palabra = lector.leeEntrada();

        ContadorCaracteres contadorCaracteres = new ContadorCaracteres();
        System.out.println("Hay " + contadorCaracteres.cuentaVocales(palabra) + " vocales");
        System.out.println("Hay " + contadorCaracteres.cuentaNumeros(palabra) + " numeros");
        System.out.println("Hay " + contadorCaracteres.cuentaConsonantes(palabra) + " consonantes");
        System.out.println("Hay " + contadorCaracteres.cuentaSimbolos(palabra) + " simbolos");
    }
}
