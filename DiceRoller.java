import java.util.HashMap;

public class DiceRoller {
    private final HashMap<Dice, Boolean> dices = new HashMap<>();

    public DiceRoller() {
        for (int i = 0; i <= 5; i++) {
            Dice dice = new Dice();
            dices.put(dice, true);
        }
    }
    
    public void roll() {
        for (Dice dice : dices.keySet()) {
            if (dices.get(dice)) { 
                dice.roll(); 
            }
        }
    }

    public void printRoll() {
        int n = 1;
        System.out.println("hsllå?");
        
        for (Dice dice : dices.keySet()) {
            System.out.println("Dice " + n + ": " + dice.getValue());
            n++;
        }
    }
}