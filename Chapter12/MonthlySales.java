package Chapter12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonthlySales extends JFrame {

    private final double STATE_RATE = 0.04;
    private final double COUNTY_RATE = 0.02;
    private double stateTax;
    private double countyTax;
    private JPanel panel;
    private JLabel label;
    private JTextField monthlySales;
    private JButton calculate;

    public MonthlySales() {

        setTitle("Monthly Sales Tax");
        setSize(450,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        label = new JLabel("Enter total sales for the month:");
        monthlySales = new JTextField(10);
        calculate = new JButton("Calculate Sales Tax");
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(label);
        panel.add(monthlySales);
        panel.add(calculate);

        calculate.addActionListener(new CalculateListener());

        add(panel);

        setVisible(true);
    }

    private class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            double sales = Double.parseDouble(monthlySales.getText());
            stateTax = sales * STATE_RATE;
            countyTax = sales * COUNTY_RATE;
            double total = stateTax + countyTax;

            JOptionPane.showMessageDialog(null, String.format("State Tax: $%,.2f\n" +
                                            "County Tax: $%,.2f\n" + "Total Tax: $%,.2f", stateTax, countyTax, total));
        }
    }
    public static void main(String[] args) {
        new MonthlySales();
    }
}
