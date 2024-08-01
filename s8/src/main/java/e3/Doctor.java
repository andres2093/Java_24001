package e3;

public class Doctor extends Comparable<Doctor>{
    private int prueba;
    private static int prueba2;

    public int getPrueba(){
        return prueba;
    }

    public Doctor getDoctor(){
        return new Doctor();
    }

    private int getPrueba2(){
        return prueba2;
    }

    @Override
    public int compareTo(Doctor o) {
        return Doctor.prueba2;
    }
}
