package Chapter14;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Chris on 2/25/2017.
 */
public class SimpleApplet extends JApplet {

    /**
     * The init method sets up the applet, much like a constructor
     */

    public void init() {

        JLabel label = new JLabel("This is my very first applet.");

        setLayout(new FlowLayout());

        add(label);
    }


}
