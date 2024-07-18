package e2;

public class E2 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4.0,4.0,"E1");
        System.out.println("El estilo es: " + triangulo.getEstilo());
        triangulo.mostrarDimension();
        System.out.println("El area es: " + triangulo.calculaArea());
    }
}
