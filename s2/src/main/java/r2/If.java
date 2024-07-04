package r2;

public class If {
    public static void main(String[] args) {
        String mensaje;
        byte calificacion = (byte) ((Math.random() * 10) + 1);

        if (calificacion >= 1 && calificacion <= 10) {
            if (calificacion == 10) {
                mensaje = "¡Excelente!";
            } else if (calificacion == 9 || calificacion == 8) {
                mensaje = "¡Muy bien!";
            } else if (calificacion == 7) {
                mensaje = "Bien hecho";
            } else if (calificacion == 6) {
                mensaje = "Pasaste";
            } else {
                mensaje = "Mejor vuelve a intentarlo";
            }
        } else {
            mensaje = "Tu calificación debe estar entre 1 y 10";
        }

        System.out.println("Tu calificación es " + calificacion + ". " + mensaje);

        System.out.println("-------------------------------");

        int numero = (int) ((Math.random() * 10) + 1);

        String[] meses = new String[]{"ene", "feb", "mar", "abr", "may", "jun", "jul",
                "ago", "sep", "oct", "nov", "dic"};

        String mesActual = meses[numero];

        System.out.println(mesActual);

        if (mesActual.equals("ene")) {
            System.out.print("feb,");
            mesActual = "feb";
        }
        if (mesActual.equals("feb")) {
            System.out.print(" mar,");
            mesActual = "mar";
        }
        if (mesActual.equals("mar")) {
            System.out.print(" abr,");
            mesActual = "abr";
        }
        if (mesActual.equals("abr")) {
            System.out.print(" may,");
            mesActual = "may";
        }
        if (mesActual.equals("may")) {
            System.out.print(" jun,");
            mesActual = "jun";
        }
        if (mesActual.equals("jun")) {
            System.out.print(" jul,");
            mesActual = "jul";
        }
        if (mesActual.equals("jul")) {
            System.out.print(" ago,");
            mesActual = "ago";
        }
        if (mesActual.equals("ago")) {
            System.out.print(" sep,");
            mesActual = "sep";
        }
        if (mesActual.equals("sep")) {
            System.out.print(" oct,");
            mesActual = "oct";
        }
        if (mesActual.equals("oct")) {
            System.out.print(" nov,");
            mesActual = "nov";
        }
        if (mesActual.equals("nov")) {
            System.out.print(" dic.");
        }
    }
}