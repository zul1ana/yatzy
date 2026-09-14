import java.util.HashMap;

public class DiceRoller {

    private final HashMap<Dice, Boolean> dices = new HashMap<>(5);

    public DiceRoller() {
        for (int i = 0; i <= this.dices.size(); i++) {
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

    private void printRoll() {
        int n = 1;

        for (Dice dice : dices.keySet()) {
            System.out.println("Dice " + n + ": " + dice.getValue());
            n++;
        }
    }
}