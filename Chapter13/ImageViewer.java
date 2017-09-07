package Chapter13;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.ImageFilter;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileFilter;

/**
 * Created by Chris on 2/12/2017.
 */
public class ImageViewer extends JFrame{

    private JPanel imagePanel;
    private JPanel buttonPanel;
    private JButton button;
    private JLabel imageLabel;
    private FileFilter filter;

    public ImageViewer() {

        setTitle("Image Viewer");
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
        imageLabel = new JLabel("Select an image to view: ");

        imagePanel.add(imageLabel);

    }

    private void buildButtonPanel() {

        buttonPanel = new JPanel();

        button = new JButton("Get Image");
        button.addActionListener(new ButtonListener());

        buttonPanel.add(button);
    }

    private class ButtonListener implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            String filename = "";
            JFileChooser fileChooser = new JFileChooser();
            int status = fileChooser.showOpenDialog(null);

            //insert a filter to choose only image files

            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image files", "jpg"));

            if(status == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                filename = selectedFile.getPath();
            }

            ImageIcon image = new ImageIcon(filename);

            imageLabel.setIcon(image);
            imageLabel.setText(null);

            //pack to accommodate the size of the new label
            pack();

        }
    }

    public static void main(String[] args) {

        new ImageViewer();
    }
}
