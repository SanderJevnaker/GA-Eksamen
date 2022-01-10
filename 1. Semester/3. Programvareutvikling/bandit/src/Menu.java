import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private Scanner inputReader;
    private HashMap<String, String> choices;
    private String keys;
    private String menuBar = "Select command: ";
    Menu(HashMap<String, String> choices) {
        this.choices = choices;
        keys = "[";
        choices.forEach( (key, value) -> {
            keys += key;
            menuBar += "'" + key + "' (" + value + ") | ";
        });
        keys += "]";
        inputReader = new Scanner(System.in);
    }
    void show() {
        System.out.println(menuBar);
    }
    String getChoice() {
        String cmd;
        while(true) {
            cmd = inputReader.nextLine(); // nextLine
            final byte[] bytes = cmd.getBytes();
            if (bytes.length>0 && bytes[0]==13) { continue; } // Enter trigger 10, 13
            cmd = cmd.toUpperCase();
            if (cmd.matches(keys)) {
                return cmd;
            }
            else {
                System.out.println("Invalid command ('" + cmd + "'), select another (' RQ')");
            }
        }
    }
}