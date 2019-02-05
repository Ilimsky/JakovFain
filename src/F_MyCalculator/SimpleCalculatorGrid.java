package F_MyCalculator;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorGrid {
    public static void main(String[] args) {
        JPanel windowContent = new JPanel();
        GridLayout gl = new GridLayout(4,2);
        windowContent.setLayout(gl);

        JLabel label1 = new JLabel("Number 1:");    //Создаем компоненты в памяти
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        windowContent.add(label1);  //Добавляем компоненты на панель
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        JFrame frame = new JFrame("My first calculator");   //Создаем фрейм и задаем для него панель
        frame.setContentPane(windowContent);
        frame.setSize(400,100);     //Задаем размер и делаем фрейм видимым
        frame.setVisible(true);
    }
}
