
package main;

import java.util.Random;
import java.util.Scanner;
/**
 * Main class for the Dice Roll Game.
 * <p>
 * This console-based application allows the user to roll one or more dice,
 * displays each die using ASCII art, and calculates the total score.
 * </p>
 *
 * <p>
 * The game demonstrates basic Java concepts such as:
 * </p>
 * <ul>
 *   <li>User input with Scanner</li>
 *   <li>Random number generation</li>
 *   <li>Loops and conditional logic</li>
 *   <li>Methods and modular design</li>
 * </ul>
 *
 * @author Matias
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfDice;
        int total = 0;
        
        System.out.println("----- DICE ROLLER GAME -----");
        
        System.out.print("Enter name of player 1: ");
        String player1Name = scanner.nextLine();

        System.out.print("Enter name of player 2: ");
        String player2Name = scanner.nextLine();
        
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        
        System.out.println("--- Turn: ["+ player1.getName() + "] ---");
        System.out.print("Enter the number of dice to roll: ");
        numberOfDice = scanner.nextInt();
        
        if (numberOfDice > 0) {
            System.out.println("\nRolling the dice for "+ player1.getName() +"...\n");
            for (int i = 0; i < numberOfDice; i++) {
                int roll = animateRoll(random);
                System.out.println(player1.getName() +" rolled: [" + roll + "]");
                player1.addToScore(roll);
            }
            System.out.println("\nTotal score for " + player1.getName() + ": " + player1.getScore());
        } else {
            System.out.println("Please enter a number of dice greater than 0 (zero).");
        }
        
        System.out.println("--- Turn: ["+ player2.getName() + "] ---");
        System.out.print("Enter the number of dice to roll: ");
        numberOfDice = scanner.nextInt();
        
        if (numberOfDice > 0) {
            System.out.println("\nRolling the dice for "+ player2.getName() +"...\n");
            for (int i = 0; i < numberOfDice; i++) {
                int roll = animateRoll(random);
                System.out.println(player2.getName() +" rolled: [" + roll + "]");
                player2.addToScore(roll);
            }
            System.out.println("\nTotal score for " + player2.getName() + ": " + player2.getScore());
        } else {
            System.out.println("Please enter a number of dice greater than 0 (zero).");
        }
        
        System.out.println("\n--- END OF TURNS ---");
        System.out.println("FINAL SCORES: ");
        System.out.println(player1.getName() + ": [" + player1.getScore() + "]");
        System.out.println(player2.getName() + ": [" + player2.getScore() + "]");
        if (player1.getScore() > player2.getScore()) {
            System.out.println("\n🏆 Winner: " + player1.getName());
        } 
        else if (player2.getScore() > player1.getScore()) {
            System.out.println("\n🏆 Winner: " + player2.getName());
        } 
        else {
            System.out.println("It's a tie!");
        }
        
        
        
        
        scanner.close();
    }
    /**
     * Prints the ASCII representation of a die based on the rolled value.
     * <p>
     * Each die face is represented using simple ASCII characters to ensure
     * compatibility with any terminal.
     * </p>
     *
     * @param roll the value of the die (from 1 to 6)
     */
    static void printDie(int roll) {
        String dice1 = """
        -------
        |     |
        |  o  |
        |     |
        -------
        """;

        String dice2 = """
        -------
        | o   |
        |     |
        |   o |
        -------
        """;

        String dice3 = """
        -------
        | o   |
        |  o  |
        |   o |
        -------
        """;

        String dice4 = """
        -------
        | o o |
        |     |
        | o o |
        -------
        """;

        String dice5 = """
        -------
        | o o |
        |  o  |
        | o o |
        -------
        """;

        String dice6 = """
        -------
        | o o |
        | o o |
        | o o |
        -------
        """;
        
        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll.");
        }
    }
    /**
     * Simulates a dice roll animation by printing several intermediate
     * random dice faces before returning the final rolled value.
     *
     * @param random the Random instance used to generate values
     * @return the final rolled value (1 to 6)
     */
    static int animateRoll(Random random) {
        int animationLength = 5;
        int lastRoll = 0;
        for (int i = 0; i < 5; i++) {
            if (i == animationLength - 1) {
                lastRoll = random.nextInt(1, 7);
                printDie(lastRoll);
                break;
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                lastRoll = random.nextInt(1, 7);
                printDie(lastRoll);
                try {
                    Thread.sleep(180);
                } catch (InterruptedException e) {
                    System.out.println("Error");
                }
            }
        }
        return lastRoll;
    }
    
}
