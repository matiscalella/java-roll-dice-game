
package main;

/**
 * Represents a player in the dice game.
 * <p>
 * Each player has a name and a score that accumulates as dice are rolled.
 * </p>
 */
public class Player {
    private String name;
    private int score;

    /**
     * Creates a new player with the given name and an initial score of zero.
     *
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    /**
     * Returns the name of the player.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the current score of the player.
     *
     * @return the player's score
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Adds the specified number of points to the player's score.
     *
     * @param points the number of points to add
     */
    public void addToScore(int points) {
        this.score += points;
    }
    
    /**
     * Resets the player's score back to zero.
     */
    public void resetScore(){
        this.score = 0;
    }
    
}
