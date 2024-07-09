package e2;

public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe la palabra:");
        String palabra = lector.leeEntrada();

        ContadorCaracteres contadorCaracteres = new ContadorCaracteres();
//        Iterando por cada grupo
//        System.out.println("Hay " + contadorCaracteres.cuentaVocales(palabra) + " vocales");
//        System.out.println("Hay " + contadorCaracteres.cuentaNumeros(palabra) + " numeros");
//        System.out.println("Hay " + contadorCaracteres.cuentaConsonantes(palabra) + " consonantes");
//        System.out.println("Hay " + contadorCaracteres.cuentaSimbolos(palabra) + " simbolos");

//        Iterar una sola vez
        Modelo modelo = contadorCaracteres.contar(palabra);
        System.out.println("Hay " + modelo.getVocales() + " vocales");
        System.out.println("Hay " + modelo.getNumeros() + " numeros");
        System.out.println("Hay " + modelo.getConsonantes() + " consonantes");
        System.out.println("Hay " + modelo.getSimbolos() + " simbolos");
    }
}
