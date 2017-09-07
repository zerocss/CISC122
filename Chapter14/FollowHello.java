package Chapter14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class FollowHello extends Applet implements MouseListener, MouseMotionListener {
    private int x = 149;
    private int y = 99;


    public void init() {
        // Add Mouse Listeners
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paint(Graphics g) {

        g.drawString("Hello", x, y);
    }

    // Unused mouse listeners

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    // Used mouse motion listener
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();

        repaint();
    }
}

