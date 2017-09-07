package Chapter12;

import javax.swing.*;
import java.awt.event.*; //Needed for ActionListener Interface

public class KiloConverter extends JFrame {

    private JPanel panel;               //To reference a panel
    private JLabel messageLabel;        //To reference a label
    private JTextField kiloTextField;    //to reference a text field
    private JButton calcButton;         //to reference a button
    private final int WINDOW_WIDTH = 310;
    private final int WINDOW_LENGTH = 100;

    public KiloConverter() {

        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH, WINDOW_LENGTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //build the panel and add it to the frame.
        buildPanel();

        //add the panel to the frames content pane
        add(panel);

        //display the window
        setVisible(true);
    }

    private void buildPanel() {

        messageLabel = new JLabel("Enter a distance in kilometers");

        kiloTextField = new JTextField(10);

        calcButton = new JButton("Calculate");
        //Create an action listener for the button
        calcButton.addActionListener(new CalcButtonListener());

        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }

    private class CalcButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            final double CONVERSION = 0.6214;
            String input;
            double miles;

            //Get the text entered by the user into the text field
            input = kiloTextField.getText();

            //convert input to miles
            miles = Double.parseDouble(input) * CONVERSION;

            //display the result
            JOptionPane.showMessageDialog(null, input + " kilometers is " + miles + " miles.");
        }
    }

    public static void main(String[] args) {

        new KiloConverter();
    }
}
