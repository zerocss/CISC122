package Chapter16;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiplication extends JFrame {

    private JPanel labelPanel,panel, buttonPanel;
    private JLabel top, label, label2;
    private JTextField numText1, numText2, answerText;
    private JButton button;
    private int num1,num2,answer;

    public Multiplication() {

        setTitle("Multiplication use Recursion");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        buildLabelPanel();
        buildPanel();
        buildButtonPanel();

        add(labelPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);


    }

    //North panel - Label Panel
    private void buildLabelPanel() {

        labelPanel = new JPanel();

        top = new JLabel("Enter numbers to multiply:");

        labelPanel.add(top);

    }

    //Center Panel - Number fields
    private void buildPanel() {

        numText1 = new JTextField(3);
        numText2 = new JTextField(3);
        answerText = new JTextField(3);

        answerText.setEditable(false);



        label = new JLabel(" times ");
        label2 = new JLabel(" equals ");



        panel = new JPanel();
        panel.add(numText1);
        panel.add(label); // times
        panel.add(numText2);
        panel.add(label2); // equals
        panel.add(answerText);


    }

    //South panel - Button
    private void buildButtonPanel() {

        buttonPanel = new JPanel();
        button = new JButton("Multiply");
        button.addActionListener(new ButtonListener());

        buttonPanel.add(button);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            num1 = Integer.parseInt(numText1.getText());
            num2 = Integer.parseInt(numText2.getText());

            answer = multiply(num1, num2);
            String multiple = Integer.toString(answer);
            answerText.setText(multiple);
        }
    }


    public static void main(String[] args) {

        new Multiplication();

    }

    private static int multiply(int x, int y) {

        if (y == 0) {
            return 0;
        }
        else {
            return x + multiply(x, y - 1);
        }
    }
}
