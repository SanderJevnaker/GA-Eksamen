import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Eksamen Emne 3 Programvareutvikling
 *
 * bandit er console applikasjon som venter på input fra bruker og fungerer som en enarmet banditt maskin
 *
 *    -  Maskinen har 3 hjul med 5 ulike symboler
 *    -  Bruker gis en saldo på 50 ved start og restart
 *    -  Hver utførelse koster 1
 *    -  Applikasjonen termineres når saldo er 0 eller ved Quit
 *    -  Gevinst, resultat og saldo skrives ut etter hver utførelse
 *    -  Saldo skrives ut ved start, restart og ved Quit
 *
 *      Gevinst kombinasjoner     Gevinst
 *                        0,0:       1
 *                        1,1:       2
 *                        2,2:       3
 *                        3,3:       4
 *                        4,4:       5
 *                        0,0,0:     6
 *                        1,1,1:     7
 *                        2,2,2:     8
 *                        3,3,3:     9
 *                        4,4,4:    10
 *
 * OPPGAVE 1: Skriv kode i Machine.setWheels
 * OPPGAVE 2: Skriv kode i Machine.setGain
 *
 *  */

public class Main {
    static Menu menu;
    static Machine machine;
    static int balance;
    public static void main(String[] args) {
        HashMap<String, String> choices = new HashMap<>(); // key, text
        choices.put(" ", "spacebar - run");
        choices.put("R", "restart");
        choices.put("T", "test");
        choices.put("Q", "quit");
        menu = new Menu(choices);
        machine = new Machine();
        run();
    }
    // Start and restart
    static void run() { // Called on start and by restartMachine
        balance = 50;
        System.out.println("Your balance is: " + balance);
        while (true) {
            menu.show();
            final String choice = menu.getChoice();
            //Execute menu choice
            switch (choice) {
                case " ": if (runMachine()==0) { quit(); } break;
                case "R": restartMachine(); break;
                case "T": testMachine(); break;
                case "Q": quit(); break;
            }
            if (choice.equals("Q")) { break; }
        }
    }
    // Methods for Execute menu choice
    static int runMachine() { // Returning balance
        balance += machine.run() - 1;
        final String result = IntStream.of(machine.getResult()).mapToObj(Integer::toString).collect(Collectors.joining(", "));
        System.out.println("gain:" + machine.getGain() + ", result: " + result + ", balance: " + balance);
        return balance;
    }
    static void restartMachine() {
        run();
    }
    static void testMachine() {
        for (int i=0; i<200; i++) {
            boolean doQuit = runMachine()==0;
            if (doQuit) {
                quit();
                break;
            }
        }
    }
    static void quit() {
        System.out.println("Your balance is: " + balance + "\nQuiting!");
        System.exit(0);
    }
}