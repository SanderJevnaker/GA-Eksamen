import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * <p>
 * Alle oppgaver er merket med 'OPPGAVE'
 * <p>
 * Bruk metoden inform(text) alle steder der informasjon skal skrives til console
 * <p>
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */

public class Main {

    public static void main(String[] args) throws IOException {
        /** Input / Output */
        header("Input / Output");
        inform("Skriv en setning og trykk enter");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        inform(input);


        /** Grunnleggende datatyper */
        // OPPGAVE 2: Opprett alle typer av grunnleggende datatyper og initialiser dem til deres maksimale verdi
        int intMax = Integer.MAX_VALUE;
        double doubleMax = Double.MAX_VALUE;
        float floatMax = Float.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        char charMax = Character.MAX_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        boolean booleanMax = Boolean.TRUE;
        String stringMax = "String max length: ";


        header("Data types");
        // OPPGAVE 3: Skriv ut alle grunnleggende datatyper
        inform("Int max: " + intMax);
        inform("Double max: " + doubleMax);
        inform("Float max: " + floatMax);
        inform("Long max: " + longMax);
        inform("Short max: " + shortMax);
        inform("Char max: " + (int) charMax);
        inform("Byte max: " + byteMax);
        inform("Boolean max: " + booleanMax + " or " + (1));
        inform(stringMax + Integer.MAX_VALUE);

        /** Arrays */
        // OPPGAVE 4: Opprett et array byteArr av byte og initialiser det til "String as byte array"
        byte[] byteArr = "String as byte array".getBytes();

        // OPPGAVE 5: Skriv ut byteArr
        inform("Bytes to String = " + Arrays.toString(byteArr));

        // OPPGAVE 6: Opprett et array intArr av int og initialiser det med verdiene 1, 2, 3
        int[] intArr = {1, 2, 3};

        // OPPGAVE 7: Skriv ut intArr
        inform(Arrays.toString(intArr));

        /** Expressions */
        header("Expressions");
        // OPPGAVE 8: Opprett et uttrykk som resulterer i antall sekunder pr. uke
        int week = 7;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        int totalSec;

        totalSec = week * hours * minutes * seconds;


        // OPPGAVE 9: skriv ut uttrykket og resultatet
        inform("total seconds in a week = 7 * 24 * 60 * 60 is " + totalSec);

        /** operators */
        header("Operators");
        int x = 10;
        int y = 15;
        inform("x: " + x + ", y: " + y);
        // OPPGAVE 10: Skriv et uttrykk som inneholder x, y og de 7 aritmetiske operatorene
        double operators = (x - y++) + (y + x) * y-- - (x / y % x);

        // OPPGAVE 11: Skriv ut utrykket og resultatet
        inform("x - y++) + (y + x) * y-- - (x / y % x " + operators);

        /** Sammenlignings operatorer */
        x = 10;
        y = 15;
        header("Compare, x: " + x + ", y: " + y);
        // OPPGAVE 12: Sammenlign x og y med alle de 6 sammenlignings operatorene
        //      Skriv ut sammenlingninger og resultater
        boolean compOne = x == y;
        boolean compTwo = x != y;
        boolean compThree = y < x;
        boolean compFour = x > y;
        boolean compFive = x <= y;
        boolean compSix = y >= x;

        inform("x == y = " + compOne);
        inform("x != y = " + compTwo);
        inform("y < x = " + compThree);
        inform("x > y = " + compFour);
        inform("x <= y = " + compFive);
        inform("y >= x = " + compSix);


        /** Wrappere for grunnleggende datatyper */
        String strValue;
        header("Convert integer to string");

        Integer integer = 10;
        // OPPGAVE 13: Gjør om Integer integer til string og skriv ut resultatet
        strValue = String.valueOf(integer);
        inform("Integer to String = " + strValue);

        x = 10;
        // OPPGAVE 14: Gjør om en int x til string og skriv ut resultatet
        String answer;
        answer = String.valueOf(x);
        inform("Int x to String = " + answer);

        /** betingelser */
        int randomInt = random(0, 9);
        header("Condition for random int value: " + randomInt);
        // OPPGAVE 15: Opprett betingelser som skriver ut randomInt som: randomInt == 0, randomInt > 5 eller randomInt <= 5
        if (randomInt == 0) {
            inform("Random int == 0");
        } else if (randomInt > 5) {
            inform("Random int > 5");
        } else {
            inform("Random int <= 5");
        }


        /** loop */
        header("advanced loop:");
        // OPPGAVE 16: Skriv ut alle verdier i intArr med advanced loop
        for (int values : intArr) {
            inform(String.valueOf(values));
        }

        header("standard for loop:");
        // OPPGAVE 17: Skriv ut ndx og verdi for alle verdier i intArr med en standard for loop
        for (int i = 0; i < intArr.length; i++) {
            inform("index: " + i + " Values: " + intArr[i]);
        }

        header("while loop:");
        // OPPGAVE 18: Skriv ut ndx og verdi for alle verdier i intArr med en while for loop
        int index = 0;
        while (index < intArr.length) {
            inform("index " + index + " Values: " + intArr[index]);
            index++;
        }

        header("do-while loop:");
        // OPPGAVE 19: Skriv ut ndx og verdi for alle verdier i intArr med en do-while for loop

        int index2 = 0;
        do {
            inform("index " + index2 + " Values " + intArr[index2]);
            index2++;
        } while (index2 < 3);


        /** algoritme */
        int katet1 = 4;
        int katet2 = 5;
        header("Algorithm for calculating the hypotenuse of a right triangle:");
        // OPPGAVE 20: Beregn og skriv ut hypotenusen i en rettvinklet trekant
        double hypotenus = 0; // ← calculate hypotenus!
        inform("katet1: " + katet1 + ", katet2: " + katet2 + ", hypotenus: " + hypotenus);

        hypotenus = Math.hypot(katet1, katet2);
        inform("katet1: " + katet1 + ", katet2: " + katet2 + ", hypotenus: " + hypotenus);

        /** parametere  */
        header("parameter test");
        // OPPGAVE 21: Skriv og kall metoden 'testMethod' som mottar et heltall og en streng
        //      Metoden skal skrive ut parameterne
        testMethod(3, "Testing funker!");


        /** retur verdi */
        header("return value test");
        // OPPGAVE 22: Skriv metoden 'testReturn' som mottar en integer og en float
        //      Metoden skal skrive ut parameterne og returnere produktet som double
        //      Kall metoden og skriv ut resultatet
        inform("Result is: " + testReturn(150, 74));


        /** class */
        header("class test");
        // OPPGAVE 23: Opprett lokal class TestClass med en variabelen name = "testClass" og metoden show() som skriver ut navnet

        // OPPGAVE 24: Lag en forekomst av klassen testClass og kall metoden show();
        TestClass testclass = new TestClass();
        testclass.show();


        /** static members */
        header("Static member test");
        // Klassen StaticTest i StaticTest.java har medlemmene:
        //      static int staticInt = 0;
        //      private int memberInt = 0;
        //      public void show() som inkrementerer staticInt og memberInt og skriver ut begge
        // OPPGAVE 25:
        //      Opprett 2 forekomster staticTest1 og staticTest2 av klassen staticTest
        //      Kall staticTest1.show() 2 ganger
        //      Kall staticTest2.show() 2 ganger

        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();

        staticTest1.show();
        staticTest1.show();
        staticTest2.show();
        staticTest2.show();

        // OPPGAVE 26: Skriv ut en forklaring på hvorfor staticInt og memberInt oppfører seg ulikt i de 2 forekomstene
        inform("staticInt blir inkrementert når show() gjennomføres.\n" +
                "membersInt blir kun kalt når forekomsten blir kalt. Static int blir derfor 4 fordi den blir kalt 4 ganger.\n" +
                "membersInt blir 2 fordi den blir kalt 2 ganger i hver test.\n");

        /** Roules for static variables  */
        // OPPGAVE 27: Skriv ut hvorfor klassen StaticTest må ligge i egen fil

    }

    static int random(int min, int max) {
        return (int) Math.round(Math.random() * (max - min) + min);
    }

    static void header(String text) {
        System.out.println(text);
        System.out.println("-".repeat(text.length()));
    }

    static void inform(String text) {
        System.out.println("\t" + text);
    }

    static void testMethod(int testInt, String testString) {
        inform("Testing Int: = " + testInt + " :: " + "Testing String: " + testString);

    }

    static double testReturn(int num1, float num2) {
        double returnValue = num1 / num2;
        inform("num1 " + num1 + " num2 " + num2);

        return returnValue;
    }

    static class TestClass {
        String name = "testClass";

        void show() {
            inform(name);


        }

    }

}