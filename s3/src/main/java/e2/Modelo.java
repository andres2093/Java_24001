package e2;

public class Modelo {
    private int vocales, numeros, consonantes, simbolos;

    public Modelo(int vocales, int numeros, int consonantes, int simbolos) {
        this.vocales = vocales;
        this.numeros = numeros;
        this.consonantes = consonantes;
        this.simbolos = simbolos;
    }

    public int getVocales() {
        return vocales;
    }

    public int getNumeros() {
        return numeros;
    }

    public int getConsonantes() {
        return consonantes;
    }

    public int getSimbolos() {
        return simbolos;
    }
}
