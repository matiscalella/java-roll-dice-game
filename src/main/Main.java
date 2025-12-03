package main;

import java.util.Scanner;
import main.Player;

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
        Dice dice = new Dice();
        int numberOfDice;
        int total = 0;
        
        System.out.println("----- DICE ROLLER GAME -----");
        
        System.out.print("Enter name of player 1: ");
        String player1Name = scanner.nextLine();

        System.out.print("Enter name of player 2: ");
        String player2Name = scanner.nextLine();
        
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        System.out.print("Enter the number of dice to roll: ");
        numberOfDice = scanner.nextInt();

        System.out.println("--- Turn: ["+ player1.getName() + "] ---");
     
        if (numberOfDice > 0) {
            System.out.println("\nRolling the dice for "+ player1.getName() +"...\n");
            for (int i = 0; i < numberOfDice; i++) {
                int roll = dice.roll();
                System.out.println(player1.getName() +" rolled: [" + roll + "]");
                player1.addToScore(roll);
            }
            System.out.println("\nTotal score for " + player1.getName() + ": " + player1.getScore());
        } else {
            System.out.println("Please enter a number of dice greater than 0 (zero).");
        }
        
        System.out.println("\n--- Turn: ["+ player2.getName() + "] ---");
        
        if (numberOfDice > 0) {
            System.out.println("\nRolling the dice for "+ player2.getName() +"...\n");
            for (int i = 0; i < numberOfDice; i++) {
                int roll = dice.roll();
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
    
}