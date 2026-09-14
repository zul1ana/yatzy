import java.util.Random;

public class Dice {

    private int value;
    private final Random r = new Random();

    public int getValue(){
        return this.value;
    }

    public void roll(){
        this.value = 1 + r.nextInt(6);
    }

}