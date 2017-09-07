package Chapter12;
import javax.swing.*;

public class ShowWindow {

    public static void main(String[] args) {

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        JFrame window = new JFrame();

        window.setTitle("A simple Window");

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }
}
