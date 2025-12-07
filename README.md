# TicTacToe

This is TicTacToe game with  Winning conditions and restart feature

by using AWT and Event Handling

⭐ Tic Tac Toe Game (Java AWT)

A clean and interactive Tic Tac Toe game built using Java AWT. Supports two‑player mode, win/draw detection, and a complete restart feature.

🎮 Game Features

✔️ Player 1 uses 0, Player 2 uses X

✔️ Real‑time turn switching

✔️ Detects all 8 winning combinations

✔️ Detects draw state

✔️ Buttons disable after selection

✔️ Restart button resets entire game instantly

🗂️ Project Structure
📁 TicTacToe
│── FDemo.java   → Contains game logic & UI
│── Demo.java    → Main class (entry point)
└── README.md    → Documentation
🛠️ Technologies Used

Java AWT (GUI)

Event Handling

Object-Oriented Programming (OOP)

▶️ How to Run

Install JDK 8+

Save FDemo.java and Demo.java in the same folder

Open terminal in that folder

Compile:

javac Demo.java

Run:

java Demo
📌 Game Rules

Player 1 starts and places 0

Player 2 follows with X

Win by completing:

3 in a row

3 in a column

3 diagonally

If all 9 boxes are filled with no winner → Draw

🔄 Restart Feature

The Restart button:

Clears all 9 boxes

Resets turn to Player 1

Clears winner/draw message

Enables all buttons again

🧩 Grid Layout (Visual Guide)
Player 1 -> '0'
Player 2 -> 'X'


  [0] [1] [2]
  [3] [4] [5]
  [6] [7] [8]


Winner / Draw Message


        [ Restart ]
🧠 Code Overview (Short Summary)

3×3 grid made using an array of Button

Each click updates symbol and disables the button

checkWinner() checks win/draw after each move

A boolean gameOver prevents extra moves after finish

resetGame() fully resets UI and game state

👨‍💻 Author

Created for practicing Java GUI & AWT event handling.

📄 License

Free to use for learning and academic purposes.

