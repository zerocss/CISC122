package Chapter21;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GUIArrayDequeue extends JFrame{

    private JTextField[] qViewTextField;
    private Deque queue;

    private JTextField commandEntryTextField;

    GUIArrayDequeue() {

        setTitle("Array Based Queue Demo");

        //create Queue
        queue = new ArrayDeque<>(4);


        //Create view for queue and put it at top of frame
        qViewTextField = new JTextField[4];
        LayoutManager layout = new GridLayout(1, 4);
        JPanel qViewPanel = new JPanel(layout);

        for(int k = 0; k < qViewTextField.length; k++) {

            qViewTextField[k] = new JTextField();
            JTextField t = qViewTextField[k];
            qViewPanel.add(t);
            t.setEditable(false);
            t.setBackground(Color.WHITE);
        }
        add(qViewPanel, BorderLayout.NORTH);

        //Create commandEntryTextField and put it
        //in a panel at the bottom of the frame

        commandEntryTextField = new JTextField(15);
        ActionListener lis = new CmdTextListener();
        commandEntryTextField.addActionListener(lis);
        JPanel commandEntryPanel = new JPanel();
        commandEntryPanel.add(new JLabel("Command: "));
        commandEntryPanel.add(commandEntryTextField);
        add(commandEntryPanel, BorderLayout.SOUTH);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class CmdTextListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {

            String cmdText = commandEntryTextField.getText();
            Scanner sc = new Scanner(cmdText);

            if(!sc.hasNext())
                return;

            String cmd = sc.next();

            if(cmd.equals("add") || cmd.equals("enqueue")) {

                String item = sc.next();
                queue.addLast(item);
                refresh(queue.toString());
                return;
            }

            if(cmd.equals("remove") || cmd.equals("dequeue")) {
                queue.remove();
                refresh(queue.toString());
                return;
            }
        }
    }

    private void refresh(String qStr) {

        Scanner sc = new Scanner(qStr);
        sc.nextLine();
        while(sc.hasNext()) {
            int k = sc.nextInt();
            String qEntry = sc.next();
            qViewTextField[k].setText(qEntry);
        }
    }

    public static void main(String[] args) {

        new GUIArrayDequeue();
    }
}
