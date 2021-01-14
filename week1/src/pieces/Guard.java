package pieces;


import java.awt.*;

public class Guard {
    private int row;
    private int col;

    public Guard(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isMoveValid(int moveRow, int moveCol) {
        int rowCoefficient = Math.abs(moveRow - this.row);
        int colCoefficient = Math.abs(moveCol - this.col);

        return rowCoefficient == 1 && colCoefficient == 1;
    }

    public boolean isAttackValid(int AttackRow, int AttackCol) {
        return false;
    }

    public void render(Graphics g) {
        g.drawOval(10, 10, 50, 50);
    }
}
