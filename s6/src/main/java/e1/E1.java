package e1;

public class E1 {
    public static void main(String[] args) {
        Venado venado = new Venado();
        Animal animal = venado;
        Hervivoro hervivoro = animal;
        Object objeto = hervivoro;

        System.out.println("Venado " + (venado instanceof Venado));
        System.out.println("animal " + (animal instanceof Animal));
        System.out.println("hervivoro " + (hervivoro instanceof Hervivoro));
        System.out.println("objeto " + (objeto instanceof Object));
    }
}
