package game;

import java.util.Random;

/**
 * Represents a standard six-sided die used in the Dice Roller Game.
 * <p>
 * This class is responsible only for generating random values between 1 and 6.
 * It does not handle any kind of display, animation or user interface logic.
 * </p>
 *
 * <p>
 * The randomness is provided by an internal {@link Random} instance, created
 * when the {@code Dice} object is instantiated.
 * </p>
 */
public class Dice {

    private final Random random;

    /**
     * Creates a new {@code Dice} instance with its own {@link Random} generator.
     */
    public Dice() {
        this.random = new Random();
    }

    /**
    * Simulates rolling this die once.
    *
    * @return a random integer between 1 and 6 inclusive
    */
    public int roll() {
        return this.random.nextInt(6) + 1;
    }
}