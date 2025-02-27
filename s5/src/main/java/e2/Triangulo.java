package e2;

public class Triangulo extends FiguraPlana {
    private final String estilo;

    public Triangulo(double base, double altura, String estilo) {
        super(base, altura);
        this.estilo = estilo;
    }

    public double calculaArea() {
        return getBase() * getAltura() / 2;
    }

    public String getEstilo() {
        return estilo;
    }
}
