package game;

import pieces.Guard;

import java.awt.*;

public class GameTile {
    //bqha private no zaradi Guard
    public int row;
    public int col;
    public int tileSize;

    public GameTile(int row, int col) {
        this.row = row;
        this.col = col;
        this.tileSize = 100;
    }

    public void render(Graphics g) {
        //int tileSize = 100;
        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        switch (row) {
            case 0:
                if (col < 4) {
                    Guard g1 = new Guard(row, col);
                }
                if (col == 0 || col == 4)
                    g.setColor(new Color(255, 69, 0));
                else if (col == 1 || col == 3)
                    g.setColor(new Color(18, 18, 18));
                else
                    g.setColor(Color.white);
                break;
            case 1:
                if (col != 2)
                    g.setColor(Color.gray);
                else
                    g.setColor(Color.white);
                break;
            case 2:
                if (col != 2)
                    g.setColor(Color.WHITE);
                else
                    g.setColor(Color.white);
                break;
            case 3:
                if (col != 2)
                    g.setColor(Color.gray);
                else
                    g.setColor(Color.white);
                break;
            case 4:
                if (col == 1 || col == 3) {
                    g.setColor(new Color(255, 69, 0));

                } else if (col == 0 || col == 4)
                    g.setColor(new Color(18, 18, 18));
                else
                    g.setColor(Color.WHITE);
                break;

        }
        //Тук рисуваме
        g.fillRect(tileX, tileY, 100, 100);
        g.setColor(new Color(18, 18, 18));
        g.drawRect(tileX, tileY, 100, 100);

        //center piece

        g.drawOval(200, 200, 50, 50);
        g.fillOval(200, 200, 50, 50);
        g.setColor(new Color(18, 18, 18));

    }
}

