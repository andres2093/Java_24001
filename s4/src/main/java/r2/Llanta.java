package r2;

public class Llanta {
    private float ancho;
    private float diametro;
    private float presion;

    public Llanta() {
    }

    public Llanta(float diametro, float presion, float ancho) {
        this.diametro = diametro;
        this.presion = presion;
        this.ancho = ancho;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Llanta llanta = (Llanta) obj;

        if (Float.compare(llanta.ancho, ancho) != 0) return false;
        if (Float.compare(llanta.diametro, diametro) != 0) return false;
        return Float.compare(llanta.presion, presion) == 0;
    }

    public void rueda(){
        System.out.println("Rodando.... ");
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }
}