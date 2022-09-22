import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends CountNeigbours  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        boolean[][] temp = new boolean[width][height];


        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int count = CountNeigbours(i,j);
                if (boardFrame[i][j]) {
                    if (count < 2)
                        temp[i][j] = false;
                    if (count == 3 || count == 2)
                        temp[i][j] = true;
                    if (count > 3)
                        temp[i][j] = false;

                } else {
                    if (count == 3)
                        temp[i][j] = true;
                }
            }
        }
        boardFrame = temp;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (boardFrame[i][j]) {
                    cells[i][j].setBackground(Color.black);
                } else
                    cells[i][j].setBackground(Color.white);
            }
        }
    }
}
