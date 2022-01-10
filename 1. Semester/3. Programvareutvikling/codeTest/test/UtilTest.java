/**
 * OPPGAVER:
 *      OPPGAVE 1: UtilTest.java
 *      OPPGAVE 2: Util.java
 * */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {
    // OPPGAVE 1: Lag tester for metodene i Util.java med samme navn
    // (erstatt assert false med egnede jupiter Assertions)
    @Test
    void circleArea() {
        final double area = Util.circleArea(2D);
        assertEquals(12.57, area, 0.01);
    }
    @Test
    void rectArea() {
        final double area = Util.rectArea(2D);
        assertEquals(4, area);
    }
    @Test
    void sphereArea() {
        final double area = Util.sphereArea(2D);
        assertEquals(50.27, area, 0.01);
    }
    @Test
    void effect() {
        final double effect = Util.effect(2D, 3D);
        assertEquals(6, effect);
    }
    @Test
    void pow4() {
        final double pow4 = Util.pow4(2);
        assertEquals(16, pow4);
    }
    @Test
    void random() {
        int MIN = 11;
        int MAX = 14;
        int RUNCOUNT = 2000;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <RUNCOUNT; i++) {
            list.add(Util.random(MIN, MAX));
        }
        int maxX = Collections.max(list);
        int minN = Collections.min(list);

        assertEquals(MAX, maxX);
        assertEquals(MIN, minN);
        // Kall metoden random(MIN, MAX) RUNCOUNT ganger
        // Finn minste og største verdi som skal være lik MIN og MAX dersom metoden er riktig

    }

    // OPPGAVE 2: Lag metoder i Util.java for disse testene
    @Test
    void stringReverse() {
        assertEquals("gfedcbA", Util.stringReverse("Abcdefg"));
    }
    @Test
    void capitalize() {
        final String[] s = {"capitalize", "all", "words"};
        Util.capitalize(s);
        assertEquals("Capitalize", s[0] );
        assertEquals("All", s[1]);
        assertEquals("Words", s[2]);
    }
    @Test
    void stringsJoin() {
        assertEquals("s1 s2", Util.stringsJoin(new String[]{"s1", "s2"}, " "));
    }
    final int[] ints = new int[]{1, 2, 3};
    @Test
    void intsToStrings() {
        assertArrayEquals(new String[]{"1", "2", "3"}, Util.intsToStrings(ints));
    }
    @Test
    void intsToCsv() {
        assertEquals("1, 2, 3", Util.intsToCsv(ints, ", "));
        assertEquals("1,2,3", Util.intsToCsv(ints));
    }
}