package Chapter13;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Chris on 2/20/2017.
 */
public class TempConverter extends JFrame {

    private JLabel label1, label2;
    private JTextField fTemp;
    private JTextField cTemp;
    private JPanel fpanel;
    private JPanel cpanel;
    private JPanel sliderPanel;
    private JSlider slider;

    public TempConverter() {

        setTitle("Temperature Converter");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Fahrenheit: ");
        label2 = new JLabel("Celcius: ");

        //create the read-only text fields

        fTemp = new JTextField("32.0", 10);
        fTemp.setEditable(false);
        cTemp = new JTextField("0.0", 10);
        cTemp.setEditable(false);

        //create the slider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(20); //major tick every 20
        slider.setMinorTickSpacing(5);  //minor tick every 5
        slider.setPaintTicks(true);     //show tick marks
        slider.setPaintLabels(true);    //display numbers

        slider.addChangeListener(new SliderListener());

        //create panels and place the components in them

        fpanel = new JPanel();
        fpanel.add(label1);
        fpanel.add(fTemp);

        cpanel = new JPanel();
        cpanel.add(label2);
        cpanel.add(cTemp);

        sliderPanel = new JPanel();
        sliderPanel.add(slider);

        //create GridLayout manager
        setLayout(new GridLayout(3,1));

        add(fpanel);
        add(cpanel);
        add(sliderPanel);

        pack();
        setVisible(true);
    }

    private class SliderListener implements ChangeListener {

        public void stateChanged(ChangeEvent e) {

            double fahrenheit, celsius;

            celsius = slider.getValue();

            fahrenheit = (9.0/5.0) * celsius + 32.0;

            //store the celsius temp in the display field
            cTemp.setText(Double.toString(celsius));

            fTemp.setText(String.format("%.1f", fahrenheit));
        }
    }

    public static void main(String[] args) {

        new TempConverter();
    }
}
