package M_PingPong.screens;

import M_PingPong.engine.PingPongGameEngine;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.event.KeyListener;

public class PingPongGreenTable extends JPanel implements GameConstants {

    private JLabel label;
    private int computerRacket_Y = COMPUTER_RACKET_Y_START;
    private int kidRacket_Y = KID_RACKET_Y_START;
    private int ballX = BALL_START_X;
    private int ballY = BALL_START_Y;
    Dimension preferredSize = new Dimension(TABLE_WIDTH,TABLE_HEIGHT);

    public Dimension getPreferredSize() {
        return preferredSize;
    }

    PingPongGreenTable(){
        PingPongGameEngine gameEngine = new PingPongGameEngine(this);

        addMouseMotionListener(gameEngine);

        addKeyListener(gameEngine);
    }

    void addPanelToFrame(Container container){
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(this);
        label = new JLabel("\"Press N for a new game, S to serve or Q to quit");
        container.add(label);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.fillRect(0,0,TABLE_WIDTH,TABLE_HEIGHT);

        g.setColor(Color.yellow);
        g.fillRect(KID_RACKET_X, kidRacket_Y, RACKET_WIDTH, RACKET_LENGTH);

        g.setColor(Color.blue);
        g.fillRect(COMPUTER_RACKET_X, computerRacket_Y, RACKET_WIDTH,RACKET_LENGTH);

        g.setColor(Color.red);
        g.fillOval(ballX,ballY,10,10);

        g.setColor(Color.white);
        g.drawRect(10,10,300,200);
        g.drawLine(160,10,160,210);

        requestFocus();
    }

    public void setKidRacket_Y(int yCoordinate){
        this.kidRacket_Y = yCoordinate;
    }

    public int getKidRacket_Y(){
        return kidRacket_Y;
    }

    public void setComputerRacket_Y(int yCoordinate){
        this.computerRacket_Y = yCoordinate;
        repaint();
    }

    public void setMessageText(String text){
        label.setText(text);
        repaint();
    }

    public void setBallPosition(int xPos, int yPos){
        ballX = xPos;
        ballY = yPos;
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Ping Pong Green Table");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PingPongGreenTable table = new PingPongGreenTable();
        table.addPanelToFrame(f.getContentPane());

        f.setBounds(0,0,TABLE_WIDTH+5, TABLE_HEIGHT+40);
        f.setVisible(true);
    }
}
