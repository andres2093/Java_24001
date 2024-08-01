package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
//        Palabra
        Pattern pattern = Pattern.compile("Bedu", Pattern.CASE_INSENSITIVE);
        matcherCheck(pattern.matcher("Visit bedu.com!"), "Visit bedu.com!'");

//        Letras especificas
        pattern = Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE);
        matcherCheck(pattern.matcher("polb"), "polb'");

//        Solo letras
        pattern = Pattern.compile("^[a-z]$", Pattern.CASE_INSENSITIVE);
        matcherCheck(pattern.matcher("be7to"), "be7to'");

//        Solo numeros
        pattern = Pattern.compile("[0-9]");
        matcherCheck(pattern.matcher("700"), "700'");

//        Formato fecha
        pattern = Pattern.compile("(\\d{2}/)(\\d{2}/)(\\d{4})");
        matcherCheck(pattern.matcher("11/11/2024"), "11/11/2024'");

//        Correo
        pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        matcherCheck(pattern.matcher("andres@gmail.com"), "andres'");
    }

    static void matcherCheck(Matcher matcher, String input){
        boolean matchFound = matcher.find();
        System.out.println((matchFound ? "Si: '" : "No: '") + matcher.pattern() + "' esta en '" + input);
    }
}
