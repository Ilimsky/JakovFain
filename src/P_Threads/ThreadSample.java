package P_Threads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadSample extends JFrame implements ActionListener, Runnable {

    ThreadSample(){
        GridLayout gl = new GridLayout(2,1);
        this.getContentPane().setLayout(gl);

        JButton myButton = new JButton("Kill Time");
        myButton.addActionListener(this);
        this.getContentPane().add(myButton);

        this.getContentPane().add(new JTextField());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Thread worker = new Thread(this);
        worker.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <300000 ; i++) {
            this.setTitle("i=" + i);
        }
    }

    public static void main(String[] args) {
        ThreadSample myWindow = new ThreadSample();
        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myWindow.setBounds(0,0,150,100);
        myWindow.setVisible(true);
    }
}
