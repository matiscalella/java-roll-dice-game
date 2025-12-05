package game;

import javax.swing.JTextArea;

/**
 * Represents the core game model of the Dice Roller application.
 * <p>
 * This class stores the players, the dice and the configured number of
 * rolls per turn. It does not control the graphical animation or turn
 * transitions, which are handled by the GUI layer.
 * </p>
 *
 * <p>
 * The {@code Game} class acts as a shared state container between the
 * logical game elements and the user interface.
 * </p>
 */
public class Game {

    private final Player player1;
    private final Player player2;
    private final Dice dice;
    private final int numberOfDice;
    private final JTextArea output;

    /**
     * Creates a new {@code Game} instance with the given players, dice and
     * number of rolls per turn.
     *
     * @param player1 the first player
     * @param player2 the second player
     * @param dice the dice used for rolling values
     * @param numberOfDice the amount of dice rolled per player turn
     * @param output the output component used by the GUI
     *
     * @throws IllegalArgumentException if numberOfDice is less than or equal to zero
     * @throws IllegalArgumentException if any required object is {@code null}
     */
    public Game(Player player1, Player player2, Dice dice, int numberOfDice, JTextArea output) {

        if (numberOfDice <= 0) {
            throw new IllegalArgumentException("Number of dice must be greater than zero.");
        }

        if (player1 == null || player2 == null || dice == null || output == null) {
            throw new IllegalArgumentException("Players, dice and output must not be null.");
        }

        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice;
        this.numberOfDice = numberOfDice;
        this.output = output;
    }

    /** @return the first player */
    public Player getPlayer1() {
        return player1;
    }

    /** @return the second player */
    public Player getPlayer2() {
        return player2;
    }

    /** @return the dice instance */
    public Dice getDice() {
        return dice;
    }

    /** @return the number of dice rolled per turn */
    public int getNumberOfDice() {
        return numberOfDice;
    }

    /** @return the output text area used by the GUI */
    public JTextArea getOutput() {
        return output;
    }
}