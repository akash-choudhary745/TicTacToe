
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener {
    Button b1[] = new Button[9];
    Label l1, l2,l3;
    Button b10;
    String text;
    int c = 1; // 1 means player 1's turn, 0 means player 2's turn
    boolean gameOver = false;

    FDemo() {
        setTitle("Tic Tac Toe Game");
        Font f = new Font("Brush Script MT", Font.BOLD, 45);
        setFont(f);
        setLayout(null);

        l1 = new Label("Player 1 -> '0'");
        l1.setSize(300, 50);
        l1.setLocation(20, 30);
        add(l1);

        l2 = new Label("Player 2 -> 'X'");
        l2.setSize(300, 50);
        l2.setLocation(20, 70);
        add(l2);

        int i, j, k = 0;
        int x = 100;
        int y = 200;

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                b1[k] = new Button();
                b1[k].setSize(100, 100);
                b1[k].setLocation(x, y);
                add(b1[k]);
                b1[k].addActionListener(this);
                x += 100;
                k++;
            }
            y += 100;
            x = 100;
        }

        Font f1 = new Font("Brush Script MT", Font.BOLD, 20);
        setFont(f1);

        b10 = new Button("Restart");
        b10.setSize(100, 50);
        b10.setLocation(300, 550);
        add(b10);
        b10.addActionListener(this);
	
		l3=new Label();
		l3.setSize(200,50);
		l3.setLocation(130,130);
		add(l3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b10) {
            resetGame();
            return;
        }

        if (gameOver) return; // stop moves if game already finished

        Button b = (Button) e.getSource();
        if (c % 2 == 1) {
            b.setLabel("0");
            c = 0;
        } else {
            b.setLabel("X");
            c = 1;
        }
        b.removeActionListener(this);

        checkWinner();
    }

    // method to check winner after every move
    void checkWinner() {
        int[][] winPos = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // cols
            {0, 4, 8}, {2, 4, 6}             // diagonals
        };

        for (int i = 0; i < winPos.length; i++) {
            String s1 = b1[winPos[i][0]].getLabel();
            String s2 = b1[winPos[i][1]].getLabel();
            String s3 = b1[winPos[i][2]].getLabel();

            if (!s1.equals("") && s1.equals(s2) && s2.equals(s3)) {
                l3.setText("Winner: Player " + (s1.equals("0") ? "1" : "2"));
                gameOver = true;
                return;
            }
        }

//check Draw
        boolean draw = true;
        for (int i = 0; i < 9; i++) {
            if (b1[i].getLabel().equals("")) {
                draw = false;
                break;
            }
        }
        if (draw) {
            l3.setText("Match Draw!");
            gameOver = true;
        }
    }

    void resetGame() {
        for (int i = 0; i < 9; i++) {
            b1[i].setLabel("");
            b1[i].addActionListener(this);
        }
        c = 1;
        gameOver = false;
		l3.setText(" ");
        l1.setText("Player 1 -> '0'");
        l2.setText("Player 2 -> 'X'");
    }
}

class Demo {
    public static void main(String ar[]) {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setSize(500, 700);
        f.setLocation(200, 200);
    }
}
