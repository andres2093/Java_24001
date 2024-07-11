package e1;

public class Alumno {

    private String curso, objetivo;
    private byte sesion;
//    BUENA PRACTICA
    private int calificacion;
//    MALA PRACTICA
//    public int calificacion;

    {
        curso = "JAVA Standard Edition";
        objetivo = "Dominar Java";
        sesion = 4;
        calificacion = 0;
    }

    {
        curso = "JAVA SE";
    }

    public String getCurso() {
        return curso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public byte getSesion() {
        return sesion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
