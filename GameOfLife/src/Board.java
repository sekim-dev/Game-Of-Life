import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Board extends JFrame {
    int width = 50;
    int height = 50;
    boolean boardFrame[][];
    JButton cells[][];

    public Board() {

        dataInput();

        Random random = new Random();
        boardFrame = new boolean[width][height];
        cells = new JButton[width][height];
        setSize(500, 500);
        setLayout(new GridLayout(width, height));
        for (int i = 1; i < width; i++) {
            for (int j = 0; j < height; j++) {
                boardFrame[i][j] = random.nextInt(100) < 30;
                JButton cellsTemp = new JButton();
                if (boardFrame[i][j])
                    cellsTemp.setBackground(Color.black);
                else cellsTemp.setBackground(Color.WHITE);
                add(BorderLayout.CENTER, cellsTemp);
                cells[i][j] = cellsTemp;
            }
        }
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void dataInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de colunas.");
        width = scan.nextInt();

        System.out.println("Digite o numero de linhas.");
        height = scan.nextInt();
    }
}


