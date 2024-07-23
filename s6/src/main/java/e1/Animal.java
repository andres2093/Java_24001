package e1;

public abstract class Animal implements Hervivoro {
    @Override
    public boolean moverse() {
        return false;
    }

    @Override
    public String comerPlantas() {
        return "";
    }

    @Override
    public int caminar() {
        return 0;
    }
}
