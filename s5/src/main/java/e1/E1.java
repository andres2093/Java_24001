package e1;

public class E1 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();

        System.out.println("C1 instancia: " + c1.getContadorInstancia());
        System.out.println("C1 clase: " + Contador.getContadorClase());

        System.out.println("C4 instancia: " + c4.getContadorInstancia());
        System.out.println("C4 clase: " + Contador.getContadorClase());

        System.out.println("---------------------------");

        Contador c5 = new Contador();
        System.out.println("C5 clase: " + Contador.getContadorClase());
        System.out.println("C5 instancia: " + c5.getContadorInstancia());
        Contador c6 = new Contador();
        System.out.println("C6 clase: " + Contador.getContadorClase());
        Contador c7 = new Contador();
        System.out.println("C7 clase: " + Contador.getContadorClase());
        Contador c8 = new Contador();
        System.out.println("C8 clase: " + Contador.getContadorClase());
        System.out.println("C8 instancia: " + c8.getContadorInstancia());
    }
}
