

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Util {
    static double circleArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }
    static double rectArea(double length) {
        return length * length;
    }
    static double sphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    static double effect(double U, double I) {
        return U * I;
    }
    static double pow4(double num) {
        return Math.pow(num, 4);
    }
    static int random(int min, int max) {
        return (int) Math.round(Math.random() * (max - min) + min);
    }

    // OPPGAVE 2: Fyll inn kode i methoder som brukes av UtilTest
    static String stringReverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i>= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
    static void capitalize(String[] s) {
        for (int i = 0; i < s.length; i++) {
            char[] oArr = s[i].toCharArray();
            oArr[0] = Character.toUpperCase(oArr[0]);
            s[i] = new String(oArr);
        }
    }

    static String stringsJoin(String[] s, String sep) {
        String joined = String.join(sep, s);
        return joined;
    }
    static String[] intsToStrings(int[] ints) {
        String[] sArr = new String[ints.length];

        for (int i = 0; i < ints.length; i++) {
            sArr[i] = String.valueOf(ints[i]);
        }
        return sArr;
    }
    static String intsToCsv(int[] ints, String sep) {
        return IntStream.range(1, 4).boxed().map(String::valueOf)
                .collect(Collectors.joining(sep));
    }
    static String intsToCsv(int[] ints) {
        return intsToCsv(ints, ",");
    }
}
