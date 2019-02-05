package M_PingPong.screens;

import M_PingPong.engine.PingPongGameEngine;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

public class PingPongGreenTable extends JPanel implements GameConstants {

    JLabel label;
    public Point point = new Point(0,0);
    public int computerRacket_X = 15;
    private int kidRacket_Y = KID_RACKET_Y_START;

    Dimension prefferedSize = new Dimension(TABLE_WIDTH, TABLE_HEIGTH);

    public Dimension getPrefferedSize(){
        return prefferedSize;
    }

    PingPongGreenTable(){
        PingPongGameEngine gameEngine = new PingPongGameEngine(this);

        addMouseListener(gameEngine);

        addMouseMotionListener(gameEngine);
    }

    void addPanelToFrame(Container container){
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(this);
        label = new JLabel("Click to see coordinates");
        container.add(label);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.GREEN);

        g.fillRect(0,0,TABLE_WIDTH, TABLE_HEIGTH);
        g.setColor(Color.YELLOW);

        g.fillRect(KID_RACKET_X_START, kidRacket_Y, 5, 30);
        g.setColor(Color.BLUE);

        g.fillRect(computerRacket_X, 100, 5, 30);
        g.setColor(Color.RED);

        g.fillOval(25,110,10,10);
        g.setColor(Color.WHITE);

        g.drawRect(10,10,300,200);
        g.drawLine(160,10,160,210);

        if (point != null){
            label.setText("Coordinates (x, y): " + point.x + ", " + point.y);
            g.fillRect(point.x, point.y, 2, 2);
        }
    }

    public void setKidRacket_Y(int xCoordinate){
        this.kidRacket_Y = xCoordinate;
    }

    public int getKidRacket_Y(int xCoordinate){
        return kidRacket_Y;
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Ping Pong Green Table");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PingPongGreenTable table = new PingPongGreenTable();

        table.addPanelToFrame(f.getContentPane());

        f.pack();
        f.setVisible(true);
    }
}
