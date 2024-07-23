package r1;

public abstract class Figura {
    public abstract void formulaCalculaArea();
}

//public interface Figura{
//    void formulaCalculaArea();
//}

class Triangulo extends Figura {
    @Override
    public void formulaCalculaArea() {
        System.out.println("( b * a) / 2");
    }
}

class Rectangulo extends Figura {
    @Override
    public void formulaCalculaArea() {
        System.out.println("b * a");
    }
}

class Cuadrado extends Rectangulo {
    @Override
    public void formulaCalculaArea() {
        System.out.println("l * l");
    }
}