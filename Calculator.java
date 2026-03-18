//WANDURI MOSES
//CT100/G/21575/24

//SWING Calculator

import javax.swing.*;

class Calculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");

        JPanel panel = new JPanel();
        JPanel panelb = new JPanel();
        JPanel panelc = new JPanel();
        JPanel paneld = new JPanel();
        JPanel panele = new JPanel();

        JTextField textField = new JTextField(25);
        JButton button1 = new JButton(" 1 ");
        JButton button2 = new JButton(" 2 ");
        JButton button3 = new JButton(" 3 ");
        JButton button4 = new JButton(" 4 ");
        JButton button5 = new JButton(" 5 ");
        JButton button6 = new JButton(" 6 ");
        JButton button7 = new JButton(" 7 ");
        JButton button8 = new JButton(" 8 ");
        JButton button9 = new JButton(" 9 ");
        JButton button0 = new JButton(" 0 ");
        JButton buttonDot = new JButton("  . ");
        JButton buttonClear = new JButton("    C    ");
        JButton buttonDelete = new JButton("Delete");
        JButton buttonSquareRoot = new JButton(" sqrt  ");
        JButton buttonSquare = new JButton("  x^2  ");
        JButton buttonAdd = new JButton(" + ");
        JButton buttonSubtract = new JButton(" - ");
        JButton buttonMultiply = new JButton(" * ");
        JButton buttonDivide = new JButton(" / ");
        JButton buttonEquals = new JButton(" = ");

        panel.add(textField);

        panele.add(button0);
        panele.add(buttonDot);
        panele.add(buttonEquals);
        panele.add(buttonMultiply);
        panele.add(buttonDelete);
        paneld.add(button1);
        paneld.add(button2);
        paneld.add(button3);
        paneld.add(buttonAdd);
        paneld.add(buttonSquare);
        panelc.add(button4);
        panelc.add(button5);
        panelc.add(button6);
        panelc.add(buttonSubtract);
        panelc.add(buttonSquareRoot);
        panelb.add(button9);
        panelb.add(button8);
        panelb.add(button7);
        panelb.add(buttonDivide);
        panelb.add(buttonClear);
        panel.add(panelb);
        panel.add(panelc);
        panel.add(paneld);
        panel.add(panele);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}