package pieces;

import java.awt.*;

public class Leader {
    private int row;
    private int col;

    public Leader(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isMoveValid(int moveRow, int moveCol) {
        int colCoefficient = Math.abs(moveCol - this.col);
        int rowCoefficient = Math.abs(moveRow - this.row);

        return false;
        //TODO
    }

    public void render(Graphics g) {
        g.drawRect(40, 40, 50, 50);
    }
}
