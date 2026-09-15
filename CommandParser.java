import java.util.Scanner;

public class CommandParser {
    String line;

    public void readLine() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter r to roll again");

        line = myObj.nextLine();
    }

    public void desicion() {
        switch(line) {
            case "r":
                System.out.println("Player wishes to roll again");
            default:
                System.out.println("Unknown command");
        }
    }
}
