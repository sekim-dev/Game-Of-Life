public class CountNeigbours extends Board{

    public int CountNeigbours(int x, int y) {

        int count = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {

                try {
                    if (boardFrame[i][j]) {
                        count++;
                    }
                } catch (Exception e) {

                }

            }
        }
        if (boardFrame[x][y])
            count--;
        return count;
    }
}
