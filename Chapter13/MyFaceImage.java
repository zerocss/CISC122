package Chapter13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by Chris on 2/12/2017.
 */
public class MyFaceImage extends JFrame {

    private JPanel imagePanel;
    private JPanel buttonPanel;
    private JLabel imageLabel;
    private JButton button;

    public MyFaceImage() {

        setTitle("My Dumbass Face");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        buildImagePanel();
        buildButtonPanel();

        add(imagePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void buildImagePanel() {

        imagePanel = new JPanel();
        imageLabel = new JLabel("Click the button to see a retarded face");
        imagePanel.add(imageLabel);

    }

    private void buildButtonPanel() {

        ImageIcon smileyImage;

        buttonPanel = new JPanel();

       // smileyImage = new ImageIcon("C:\\Users\\Chris\\Documents\\CISC122\\src\\Chapter13\\smiley.gif");

        button = new JButton("Get Image");
      //  button.setIcon(smileyImage);
        button.addActionListener(new ButtonListener());

        buttonPanel.add(button);
    }

    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            ImageIcon image;
            String filename ="";

            JFileChooser fileChooser = new JFileChooser();
            int status = fileChooser.showOpenDialog(null);
            if(status == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                filename = selectedFile.getPath();
            }

            ImageIcon faceImage = new ImageIcon(filename);

            imageLabel.setIcon(faceImage);
            imageLabel.setText(null);

            //use pack to accommodate the new size of the label
            pack();
        }
    }

    public static void main(String[] args) {

        new MyFaceImage();
    }
}
