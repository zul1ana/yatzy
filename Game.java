public class Game {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();

        diceRoller.roll();
        diceRoller.printRoll();

        CommandParser commandParser = new CommandParser();

        commandParser.readLine();
        commandParser.desicion();
    }
}
