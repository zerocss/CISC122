package Chapter14;
import javax.swing.*;
import java.awt.*;
/**
 * Created by Chris on 2/25/2017.
 */
public class LineDemo extends JApplet {

    public void init() {
        getContentPane().setBackground(Color.white);
    }

    public void paint(Graphics g) {

        super.paint(g);

        g.setColor(Color.red);
        g.drawLine(20,20,280,280);

        g.setColor(Color.blue);
        g.drawLine(280,20,20,280);
    }
}
