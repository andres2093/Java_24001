package e1;

public class Primitivos {
    public static void main(String[] args) {
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.5F;
        double valorDouble = 1.5;

        System.out.println("valorByte: " + valorByte);
        System.out.println("valorShort: " + valorShort);
        System.out.println("valorInt: " + valorInt);
        System.out.println("valorLong: " + valorLong);
        System.out.println("valorFloat: " + valorFloat);
        System.out.println("valorDouble: " + valorDouble);
        System.out.println("---------------------------------");

        boolean valBool = true;
        char valorChar = 'B';
        System.out.println("valBool: " + valBool);
        System.out.println("valorChar: " + valorChar);
        System.out.println("---------------------------------");

        System.out.println("valorFloat cast to int: " + (int) valorFloat);
        System.out.println("valorChar cast to int: " + (int) valorChar);
//        System.out.println("valBool cast to int: " + (int) valBool); -> No se permite

        System.out.println("valorInt: " + valorInt);
        valorInt = valorInt + 1;
        System.out.println("valorInt: " + valorInt);
        valorInt += 1;
        System.out.println("valorInt: " + valorInt);
        valorInt++;
        System.out.println("valorInt: " + valorInt);
        valorInt--;
        System.out.println("valorInt: " + valorInt);

        valorChar++;
        System.out.println("char: " + valorChar);
        System.out.println("char cast to int: " + (int) valorChar);
        System.out.println("char sumando interos: " + (valorChar + valorInt));
        System.out.println("char sumando interos mantiendo el char: " + (char) (valorChar + valorInt));
    }
}
