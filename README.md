# 🎲 Dice Roll Game - Java Console Application

A dynamic and interactive **Dice Roll Game built in Java** featuring
animated dice, two-player multiplayer mode, and a final winner
determination system. Players take turns rolling animated dice and their
total scores are compared at the end of the match.

This project started as a single-player game and was later expanded into
a **multiplayer console game with real-time animation** using ANSI
escape codes.

------------------------------------------------------------------------

## 🚀 Features

-   🎲 Animated dice roll using real-time terminal rendering
-   👥 Two-player multiplayer mode
-   🔁 Player turns with independent score tracking
-   📊 Final score summary
-   🏆 Automatic winner detection or tie result
-   ⏱️ Smooth animation timing with `Thread.sleep`
-   ✅ Input validation for number of dice
-   💡 Clean and modern Java syntax (text blocks, switch expressions)

------------------------------------------------------------------------

## 🧠 Concepts Practiced

This project reinforces the following Java fundamentals:

-   Object-Oriented Programming (OOP)
-   Encapsulation using custom `Player` class
-   Loops and conditional logic
-   Random number generation (`Random`)
-   User input handling (`Scanner`)
-   Text blocks for ASCII art
-   Exception handling
-   ANSI escape codes for terminal control

------------------------------------------------------------------------

## ▶️ How to Run

### 1. Clone the repository

``` bash
git clone https://github.com/matiscalella/java-roll-dice-game.git
```

### 2. Compile the program

``` bash
javac main/Main.java
```

### 3. Run the game

``` bash
java main.Main
```

> ⚠️ For best animation results, run the game using **Git Bash**,
> **Windows Terminal**, or any real terminal. Some IDE output consoles
> do not fully support ANSI animations.

------------------------------------------------------------------------

## 🎮 Example Gameplay

``` text
----- DICE ROLLER GAME -----
Enter name of player 1: Matias
Enter name of player 2: Juan

--- Turn: [Matias] ---
Enter the number of dice to roll: 3

Rolling the dice for Matias...

🎲 (animated roll effect)

Matias rolled: [5]
Matias rolled: [2]
Matias rolled: [6]

Total score for Matias: 13

--- Turn: [Juan] ---
Enter the number of dice to roll: 3

Rolling the dice for Juan...

Juan rolled: [4]
Juan rolled: [1]
Juan rolled: [3]

Total score for Juan: 8

--- END OF TURNS ---
FINAL SCORES:
Matias: [13]
Juan: [8]

🏆 Winner: Matias
```

------------------------------------------------------------------------

## 📌 Project Structure

    📦 java-roll-dice-game
     ├── src/
     │   └── main/
     │       ├── Main.java
     │       ├── Player.java
     │       ├── Dice.java
     │       └── Game.java
     ├── README.md
     └── .gitignore

------------------------------------------------------------------------

## 🛠️ Technologies Used

-   Java 17+
-   Console-based interface
-   ASCII graphics
-   ANSI terminal rendering

------------------------------------------------------------------------

## 📈 Future Improvements (Planned)

-   🔄 Multiple rounds (best of 3, best of 5)
-   🧱 Full game architecture using `Game` and `Dice` classes
-   🖥️ Graphical User Interface (GUI)
-   🎲 Parallel dice animations
-   📊 Match history and statistics

------------------------------------------------------------------------

## 👨‍💻 Author

Developed by **Matias Scalella**\
As part of personal practice and Java portfolio development.

------------------------------------------------------------------------

## 📄 License

This project is open-source and available for educational and personal
use.
