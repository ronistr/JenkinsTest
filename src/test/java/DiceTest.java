import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
    }

    @Test
    void rollGeneratesValuesBetween1And6() {
        dice.roll();
        assertTrue(dice.getDice1() >= 1 && dice.getDice1() <= 6);
        assertTrue(dice.getDice2() >= 1 && dice.getDice2() <= 6);
    }

    @Test
    void rollIncrementsCountUntilDouble() {
        int initialCount = dice.getCount();
        while (!dice.isDouble()) {
            dice.roll();
        }
        assertEquals(initialCount, dice.getCount());
    }

    @Test
    void isDoubleReturnsTrueWhenBothDiceAreEqual() {
        dice.roll();
        while (!dice.isDouble()) {
            dice.roll();
        }
        assertTrue(dice.isDouble());
    }

    @Test
    void isDoubleReturnsFalseWhenDiceAreNotEqual() {
        dice.roll();
        while (dice.isDouble()) {
            dice.roll();
        }
        assertFalse(dice.isDouble());
    }

    @Test
    void getDice1ReturnsCorrectValue() {
        dice.roll();
        assertTrue(dice.getDice1() >= 1 && dice.getDice1() <= 6);
    }

    @Test
    void getDice2ReturnsCorrectValue() {
        dice.roll();
        assertTrue(dice.getDice2() >= 1 && dice.getDice2() <= 6);
    }

    @Test
    void countRollsIncrementsCount() {
        int initialCount = dice.getCount();
        dice.countRolls();
        assertEquals(initialCount + 1, dice.getCount());
    }
}