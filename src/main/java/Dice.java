import java.util.Random;

public class Dice {
    private int dice1;
    private int dice2;
    private int count;
    private final Random random;

    public Dice() {
        dice1 = 0;
        dice2 = 0;
        count = 0;
        random = new Random();
    }

    public void roll() {
        dice1 = random.nextInt(6) + 1;
        dice2 = random.nextInt(6) + 1;
        if (isDouble()) {
            count = 0;
        } else {
            countRolls();
        }
    }

    public boolean isDouble() {
        return dice1 == dice2;
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public int getCount() {
        return count;
    }

    public void countRolls() {
        count++;
    }
}