package game;

import pieces.Guard;
import pieces.Leader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {

    private ArrayList<Object> pieceCollection;

    public GameBoard() {

        this.pieceCollection = new ArrayList<>();
        //yellow
        this.pieceCollection.add(new Guard(0, 0));
        this.pieceCollection.add(new Guard(0, 1));
        this.pieceCollection.add(new Guard(0, 2));
        this.pieceCollection.add(new Guard(0, 3));

        //green
        this.pieceCollection.add(new Guard(4, 1));
        this.pieceCollection.add(new Guard(4, 2));
        this.pieceCollection.add(new Guard(4, 3));
        this.pieceCollection.add(new Guard(4, 4));

        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {

                GameTile tile = new GameTile(row, col);
                tile.render(g);

                Guard g1 = new Guard(row, col);
                g1.render(g);

                Leader l1 = new Leader(row,col);
                l1.render(g);

                if (row == 0 || row ==4){
                //todo

                }

            }
        }
    }
}
