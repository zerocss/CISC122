package Chapter16;

import javax.swing.JOptionPane;

/**
 * Created by Chris on 3/11/2017.
 */
public class Factorial {

    public static void main(String[] args) {

        String input;
        int number;

        input = JOptionPane.showInputDialog("Enter a nonnegative integer");

        number = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null, number + "! is " + factor(number));
    }

    private static int factor(int n) {

        if(n == 0) {
            return 1;
        }
        else {
            return n*factor(n - 1);
        }
    }
}
