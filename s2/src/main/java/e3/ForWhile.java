package e3;

public class ForWhile {
    public static void main(String[] args) {
        System.out.print("for -> ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.print("foreach -> ");
        short[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < valores.length; i++) {
//            System.out.print(" " + valores[i]);
//        }
        for (short valor : valores) {
            System.out.print(" " + valor);
        }

        System.out.println();
        System.out.println("----------------------------");
        System.out.print("while -> ");

        short i = 0;
        while (++i <= 10) {
            System.out.print(" " + i);
        }

        i = 1;
        System.out.println();
        System.out.print("do while -> ");
        do {
            System.out.print(" " + i);
        } while (i++ < 10);
    }
}
