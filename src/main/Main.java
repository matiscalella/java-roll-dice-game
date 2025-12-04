package main;

import java.util.Scanner;


/**
 * Main class for the Dice Roll Game.
 * <p>
 * This console-based application initializes the players, gathers user input,
 * and starts the game session.
 * </p>
 *
 * @author Matias
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        int numberOfDice;
        
        System.out.println("----- DICE ROLLER GAME -----");
        
        System.out.print("Enter name of player 1: ");
        String player1Name = scanner.nextLine();

        System.out.print("Enter name of player 2: ");
        String player2Name = scanner.nextLine();
        
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        System.out.print("Enter the number of dice to roll: ");
        numberOfDice = scanner.nextInt();

        Game game = new Game(player1, player2, dice, numberOfDice);
        game.play();

        scanner.close();
    }
    
}