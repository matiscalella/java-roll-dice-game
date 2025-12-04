
package main;

/**
 * Represents a single dice game session between two players.
 * <p>
 * The {@code Game} class coordinates the flow of the match, including:
 * </p>
 * <ul>
 *   <li>Managing two {@link Player} instances.</li>
 *   <li>Handling dice rolls through a {@link Dice} instance.</li>
 *   <li>Running turns for each player and tracking their scores.</li>
 *   <li>Displaying the final results and determining a winner.</li>
 * </ul>
 *
 * This class encapsulates the game logic so that {@code Main} is only
 * responsible for gathering input and starting the game.
 */
public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;
    private int numberOfDice;

    /**
    * Creates a new {@code Game} instance with two players, a dice
    * and a fixed number of dice rolls per player.
    *
    * @param player1      the first player participating in the game
    * @param player2      the second player participating in the game
    * @param dice         the {@link Dice} instance used to perform rolls
    * @param numberOfDice the number of dice each player will roll per game
    *
    * @throws IllegalArgumentException if {@code numberOfDice} is less than or equal to zero
    */
    public Game(Player player1, Player player2, Dice dice, int numberOfDice) {
        if (numberOfDice <= 0) {
            throw new IllegalArgumentException("Number of dice must be greater than zero.");
        }
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice;
        this.numberOfDice = numberOfDice;
    }
    
    /**
     * Starts the game flow.
     * <p>
     * This method runs the turn for each player, displays intermediate
     * results, prints the final scores and announces the winner or a tie.
     * </p>
     */
    public void play() {
        playTurn(player1);
        playTurn(player2);
        System.out.println("\n----- END OF TURNS -----");
        System.out.println("^^^ FINAL SCORES ^^^");
        System.out.println(player1.getName() + ": [" + player1.getScore() + "]");
        System.out.println(player2.getName() + ": [" + player2.getScore() + "]");
        if (player1.getScore() > player2.getScore()) {
            System.out.println("\n🏆 Winner: " + player1.getName());
        } 
        else if (player2.getScore() > player1.getScore()) {
            System.out.println("\n🏆 Winner: " + player2.getName());
        } 
        else {
            System.out.println("\nIt's a tie!");
        }
    }
    
    /**
     * Executes a full turn for a given player.
     * <p>
     * The player rolls the configured number of dice using the shared
     * {@link Dice} instance. Each roll is animated and added to the player's
     * total score.
     * </p>
     *
     * @param player the {@link Player} whose turn is being executed
     */
    private void playTurn(Player player) {

        System.out.println("--- Turn: ["+ player.getName() + "] ---");
        System.out.println("\nRolling the dice for "+ player.getName() +"...\n");
        for (int i = 0; i < numberOfDice; i++) {
            int roll = dice.roll();
            System.out.println(player.getName() +" rolled: [" + roll + "]");
            player.addToScore(roll);
        }
        System.out.println("\nTotal score for " + player.getName() + ": " + player.getScore());
    }
    
}
