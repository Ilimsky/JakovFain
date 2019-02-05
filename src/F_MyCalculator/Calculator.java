package F_MyCalculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    // Объявление всех компонентов калькулятора.
    JPanel windowContent;
    JTextField displayField;
    JButton numButtons[] = new JButton[10];

    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivide;
    JButton buttonMultiply;
    JButton buttonClear;

    JPanel p1;
    JPanel p2;

    // В конструкторе создаются все компоненты
    // и добавляются на фрейм с помощью комбинации
    // Borderlayout и Gridlayout

    Calculator(){

        windowContent = new JPanel();

        BorderLayout bl = new BorderLayout(); // Задаём схему для этой панели
        windowContent.setLayout(bl);

        displayField = new JTextField(); // Создаём и отображаем поле
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        windowContent.add("North", displayField); // Добавляем его в Северную область окна

        for (int i = 0; i < 10; i++ ){
            numButtons[i] = new JButton(""+i);
        }

        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");
        buttonClear = new JButton("C");

        // Создаём панель с GridLayout
        // которая содержит 12 кнопок - 10 кнопок с числами
        // и кнопки с точкой и знаком равно
        p1 = new JPanel();
        GridLayout gl = new GridLayout(4,4);
        p1.setLayout(gl);

        p2 = new JPanel();
        GridLayout g2 = new GridLayout(4,1);
        p2.setLayout(g2);

        for (int i = 0; i < 10; i++){
            p1.add(numButtons[i]);
        }

        p1.add(buttonPoint);
        p1.add(buttonEqual);
        p1.add(buttonClear);
        windowContent.add("Center", p1); // Помещаем панель p1 в центральную область окна

        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivide);
        p2.add(buttonMultiply);
        windowContent.add("East", p2);

        JFrame frame = new JFrame("Calculator"); //Создаём фрейм и задаём его основную панель
        frame.setContentPane(windowContent);
        frame.pack(); // делаем размер окна достаточным  для того, чтобы вместить все компоненты
        frame.setVisible(true); // Наконец, отображаем окно

        CalculatorEngine calculatorEngine = new CalculatorEngine(this);
        for (int i =0; i <10; i++){
            numButtons[i].addActionListener(calculatorEngine);
        }
        buttonPoint.addActionListener(calculatorEngine);
        buttonEqual.addActionListener(calculatorEngine);
        buttonPlus.addActionListener(calculatorEngine);
        buttonMinus.addActionListener(calculatorEngine);
        buttonDivide.addActionListener(calculatorEngine);
        buttonMultiply.addActionListener(calculatorEngine);
        buttonClear.addActionListener(calculatorEngine);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
