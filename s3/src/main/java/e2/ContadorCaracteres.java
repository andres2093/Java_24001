package e2;

public class ContadorCaracteres {
    public boolean isVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public boolean isNumero(char caracter) {
        short codigoAscii = (short) caracter;
        return codigoAscii >= 48 && codigoAscii <= 57;
    }

    public boolean isConsonante(char caracter) {
        short codigoAscii = (short) caracter;
        return (codigoAscii >= 97 && codigoAscii <= 122) && !isVocal(caracter);
    }

    public boolean isSimbolo(char caracter) {
        return !(isVocal(caracter) || isNumero(caracter) || isConsonante(caracter));
    }

    public int cuentaVocales(String palabra) {
        int cantidad = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isVocal(c)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cuentaNumeros(String palabra) {
        int cantidad = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isNumero(c)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cuentaConsonantes(String palabra) {
        int cantidad = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isConsonante(c)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cuentaSimbolos(String palabra) {
        int cantidad = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isSimbolo(c)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public Modelo contar(String palabra) {
        int vocales = 0, numeros = 0, consonantes = 0, simbolos = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isVocal(c)) {
                vocales++;
            }
            if (isNumero(c)) {
                numeros++;
            }
            if (isConsonante(c)) {
                consonantes++;
            }
            if (isSimbolo(c)) {
                simbolos++;
            }
        }
        return new Modelo(vocales, numeros, consonantes, simbolos);
    }
}
