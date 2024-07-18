package e2;

public class FiguraPlana {
    private final double base, altura;

    public FiguraPlana(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    void mostrarDimension() {
        System.out.println("La base y altura es: " + base + " - " + altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
