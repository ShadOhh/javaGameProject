package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    //SCREEN SETTINGS

    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;

    final int maxScreenCol = 16;
    final int maxScreeRow = 12;
    final int screenWidth = tileSize*maxScreenCol;
    final int screenHeight = tileSize*maxScreeRow;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }





}
