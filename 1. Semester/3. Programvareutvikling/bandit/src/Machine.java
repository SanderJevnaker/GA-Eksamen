import java.util.Random;

public class Machine {
    private int WHEELS = 3;
    private int SYMBOLS = 5;
    private int[] combination = new int[WHEELS]; // ie. {0, 0, 0}
    private int gain;

    int getGain() {
        return gain;
    }

    int[] getResult() {
        return combination;
    }

    int run() {
        setWheels(); // Assign random index to combination for all wheels
        return setGain(); // Return gain (0 if combination is not a winning combination)
    }

    // OPPGAVE 1: Skriv kode for metoden setWheels
    private void setWheels() { // Set value for all wheels

        int[] wheels = new int[WHEELS];
        Random random = new Random();

        for (int i = 0; i < wheels.length; i++) {
            combination[i] = random.nextInt(SYMBOLS);

        }
    }

    // OPPGAVE 2: Skriv kode for metoden setGain
    private int setGain() {
        if ((combination[0] == 0) && (combination[1] == 0) && (combination[2] != 0)) {
            return gain = 1;
        } else if ((combination[0] == 1) && (combination[1] == 1) && (combination[2] != 1)) {
            return gain = 2;
        } else if ((combination[0] == 2) && (combination[1] == 2) && (combination[2] != 2)) {
            return gain = 3;
        } else if ((combination[0] == 3) && (combination[1] == 3) && (combination[2] != 3)) {
            return gain = 4;
        } else if ((combination[0] == 4) && (combination[1] == 4) && (combination[2] != 4)) {
            return gain = 5;
        } else if (combination[0] == 0 && combination[1] == 0) {
            return gain = 6;
        } else if (combination[0] == 1 && combination[1] == 1) {
            return gain = 7;
        } else if (combination[0] == 2 && combination[1] == 2) {
            return gain = 8;
        } else if (combination[0] == 3 && combination[1] == 3) {
            return gain = 9;
        } else if (combination[0] == 4 && combination[1] == 4) {
            return gain = 10;
        } else {
            return gain = 0;
        }
    }
}

