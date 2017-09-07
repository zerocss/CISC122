package Chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Chris on 2/19/2017.
 */
public class MenuWindow extends JFrame{

    private JLabel messageLabel;
    private final int LABEL_WIDTH = 400;
    private final int LABEL_HEIGHT = 200;

    //the following reference menu components
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu textMenu;
    private JMenuItem exitItem;
    private JRadioButtonMenuItem blackItem;
    private JRadioButtonMenuItem redItem;
    private JRadioButtonMenuItem blueItem;
    private JCheckBoxMenuItem visibleItem;

    public MenuWindow() {

        setTitle("Example Menu System");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel = new JLabel("Use the Text menu to change my color and make me invisible",
                SwingConstants.CENTER);

        messageLabel.setPreferredSize(new Dimension(LABEL_WIDTH, LABEL_HEIGHT));

        messageLabel.setForeground(Color.BLACK);

        add(messageLabel);

        buildMenuBar();

        pack();
        setVisible(true);
    }

    private void buildMenuBar() {

        menuBar = new JMenuBar();

        buildFileMenu();
        buildTextMenu();

        menuBar.add(fileMenu);
        menuBar.add(textMenu);

        //set the windows menu bar
        setJMenuBar(menuBar);
    }

    private void buildFileMenu() {

        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.addActionListener(new ExitListener());

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        fileMenu.add(exitItem);
    }

    private void buildTextMenu() {
        /*create the radio button menu items to change
        the color of the text. Add an action listener to each one
         */

        blackItem = new JRadioButtonMenuItem("Black", true);
        blackItem.setMnemonic(KeyEvent.VK_B);
        blackItem.addActionListener(new ColorListener());

        redItem = new JRadioButtonMenuItem("Red");
        redItem.setMnemonic(KeyEvent.VK_R);
        redItem.addActionListener(new ColorListener());

        blueItem = new JRadioButtonMenuItem("Blue");
        blueItem.setMnemonic(KeyEvent.VK_U);
        blueItem.addActionListener(new ColorListener());

        //create a button group for the radio button items

        ButtonGroup group = new ButtonGroup();

        group.add(blackItem);
        group.add(redItem);
        group.add(blueItem);

        //create a check box menu item to make text visible/invisible

        visibleItem = new JCheckBoxMenuItem("Visible", true);
        visibleItem.setMnemonic(KeyEvent.VK_V);
        visibleItem.addActionListener(new VisibleListener());

        //create a JMenu object for the text menu

        textMenu = new JMenu("Text");
        textMenu.setMnemonic(KeyEvent.VK_T);

        //add the menu items to the Text Menu

        textMenu.add(blackItem);
        textMenu.add(redItem);
        textMenu.add(blueItem);
        textMenu.addSeparator(); // Add a separator bar
        textMenu.add(visibleItem);
    }

    /**
     * Private inner class that handles the event that
     * is generated when the user selects Exit from
     * the File menu
     */
    private class ExitListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.exit(0);
        }
    }

    private class ColorListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if(blackItem.isSelected()) {
                messageLabel.setForeground(Color.BLACK);
            }
            else if(redItem.isSelected()) {
                messageLabel.setForeground(Color.RED);
            }
            else if(blueItem.isSelected()) {
                messageLabel.setForeground(Color.BLUE);
            }
        }
    }

    /**
     * Private inner class that handles the event that
     * is generated when the user selects Visible from
     * the Text menu
     */
    private class VisibleListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if(visibleItem.isSelected()) {
                messageLabel.setVisible(true);
            }
            else {
                messageLabel.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {

        MenuWindow mw = new MenuWindow();
    }
}
