package Chapter12;

import javax.swing.*;

/**
 * Created by Chris on 2/2/2017.
 */
public class SimpleWindow extends JFrame  {

    public SimpleWindow() {
        final int WINDOW_WIDTH = 350;
        final int WINDOW_LENGTH = 250;

        setTitle("A Simple Window");

        setSize(WINDOW_WIDTH, WINDOW_LENGTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
