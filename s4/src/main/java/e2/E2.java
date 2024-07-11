package e2;

public class E2 {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("KIA", "Forte", 2020, 5000);
        Automovil auto2 = new Automovil("HONDA", "CIVIC", 1998, 50000);
        Automovil auto3 = new Automovil("FORD", "MUSTANG", 2000, 70000);

        System.out.println("hash " + auto1.hashCode());
        System.out.println("hash " + auto2.hashCode());
        System.out.println("hash " + auto3.hashCode());
    }
}
