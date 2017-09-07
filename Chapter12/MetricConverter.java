package Chapter12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Chris on 2/6/2017.
 */
public class MetricConverter extends JFrame {

    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JRadioButton miles;
    private JRadioButton feet;
    private JRadioButton inches;
    private ButtonGroup group;

    public MetricConverter() {

        setTitle("Metric Converter");

        setSize(400,100);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);
    }

    private void buildPanel() {

        label = new JLabel("Enter a distance in kilometers");
        textField = new JTextField(10);

        miles = new JRadioButton("Convert to miles");
        feet = new JRadioButton("Convert to feet");
        inches = new JRadioButton("Convert to inches");

        group = new ButtonGroup();

        group.add(miles);
        group.add(feet);
        group.add(inches);

        miles.addActionListener(new RadioButtonListener());
        feet.addActionListener(new RadioButtonListener());
        inches.addActionListener(new RadioButtonListener());

        panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(miles);
        panel.add(feet);
        panel.add(inches);
    }

    private class RadioButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String input;
            Double result = 0.0;
            String measurement = "";

            input = textField.getText();

            if(e.getSource() == miles) {

                result = Double.parseDouble(input) * .6214;
                measurement = " miles";

            }
            else if(e.getSource() == feet) {

                result = Double.parseDouble(input) * 3281;
                measurement = " feet";

            }
            else if(e.getSource() == inches) {

                result = Double.parseDouble(input) * 39370;
                measurement = " inches";
            }

            JOptionPane.showMessageDialog(null, input + " kilometers is " + result + measurement);
        }
    }

    public static void main(String[] args) {

        new MetricConverter();
    }
}
