package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Chris on 2/4/2017.
 */
public class ColorWindow extends JFrame {

    private JLabel label;
    private JButton redButton;
    private JButton blueButton;
    private JButton yellowButton;
    private JPanel panel;

    public ColorWindow() {

        setTitle("Colors");
        setSize(200, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Click a button to change the background color");

        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        yellowButton = new JButton("Yellow");

        redButton.addActionListener(new RedButtonListener());
        blueButton.addActionListener(new BlueButtonListener());
        yellowButton.addActionListener(new YellowButtonListener());

        panel = new JPanel();
        panel.add(label);
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellowButton);

        add(panel);

        setVisible(true);
    }
    private class RedButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            panel.setBackground(Color.red);
            label.setForeground(Color.blue);

        }
    }

    private class BlueButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            panel.setBackground(Color.blue);
            label.setForeground(Color.yellow);
        }
    }

    private class YellowButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            panel.setBackground(Color.yellow);
            label.setForeground(Color.blue);
        }
    }
    public static void main(String[] args) {
        new ColorWindow();
    }
}
