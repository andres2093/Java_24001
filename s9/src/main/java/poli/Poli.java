package poli;

public class Poli {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.hacerSonido();
        gato.hacerSonido("Dame de comer!!!");

        Perro perro = new Perro();
        perro.hacerSonido();
    }
}

class Animal {
    public void hacerSonido() {
        System.out.println("Grr...");
    }

    public void hacerSonido(String custom) {
        System.out.println(custom);
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        super.hacerSonido();
//        System.out.println("Meow...");
        hacerSonido("Meow...");
        super.hacerSonido("Meow...");
    }

    @Override
    public void hacerSonido(String custom) {
        super.hacerSonido(custom);
        System.out.println(custom);
    }
}

class Perro extends Animal {
    private int edad;
    private String nombre;

    public Perro() {
        this.edad = 0;
        this.nombre = "perro";
    }

    public Perro(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Woof... " + edad);
    }
}