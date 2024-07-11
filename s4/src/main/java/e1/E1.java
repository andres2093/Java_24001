package e1;

public class E1 {
    public static void main(String[] args) {
        Alumno beto = new Alumno();

        System.out.println("Sesión " + beto.getSesion());
        System.out.println("Curso " + beto.getCurso());
        System.out.println("Objetivo " + beto.getObjetivo());

//        BUENA PRACTICA
        System.out.println("Calificacion " + beto.getCalificacion());
        beto.setCalificacion(100);
        System.out.println("Calificacion " + beto.getCalificacion());

//        MALA PRACTICA
//        System.out.println("Calificacion " + beto.calificacion);
//        beto.calificacion = 100;
//        System.out.println("Calificacion " + beto.calificacion);
    }
}
