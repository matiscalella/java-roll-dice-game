package main;

import javax.swing.SwingUtilities;
import ui.MainWindow;

/**
 * Application entry point for the Dice Roller Game (GUI version).
 * <p>
 * This class is responsible only for launching the graphical user interface.
 * It does not contain any game logic. All gameplay behavior is handled by
 * {@link MainWindow}, {@link Game}, {@link Dice}, and {@link Player}.
 * </p>
 *
 * <p>
 * The GUI is started using {@link javax.swing.SwingUtilities#invokeLater(Runnable)}
 * to ensure that all Swing components are created and managed on the Event
 * Dispatch Thread (EDT), as required by Swing best practices.
 * </p>
 *
 * <p>
 * Responsibilities of this class:
 * </p>
 * <ul>
 *   <li>Initialize the application.</li>
 *   <li>Launch the main graphical window.</li>
 * </ul>
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }
}