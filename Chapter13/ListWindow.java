package Chapter13;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by Chris on 2/10/2017.
 */
public class ListWindow extends JFrame {

    private JPanel monthPanel;
    private JPanel selectedMonthPanel;
    private JList monthList;
    private JTextField selectedMonth;
    private JLabel label;

    private String[] months = {"January", "February", "March", "April",
                                "May", "June", "July", "August", "September",
                                "October", "November", "December"};

    public ListWindow() {

        setTitle("List Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        /*
        put panel building methods here
        add the panels here
        pack the panels into the layout
         */
        buildMonthPanel();
        buildSelectedMonthPanel();

        add(monthPanel, BorderLayout.CENTER);
        add(selectedMonthPanel, BorderLayout.SOUTH);
        pack();

        setVisible(true);
    }
    private void buildMonthPanel() {

        monthPanel = new JPanel();

        monthList = new JList(months);
        monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        monthList.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        monthList.setVisibleRowCount(6);

        //create scroll bar
        JScrollPane scroll = new JScrollPane(monthList);

        monthList.addListSelectionListener(new ListListener());

        monthPanel.add(scroll);
    }

    private void buildSelectedMonthPanel() {

        selectedMonthPanel = new JPanel();

        label = new JLabel("You selected: ");
        selectedMonth = new JTextField(10);

        selectedMonth.setEditable(false);

        selectedMonthPanel.add(label);
        selectedMonthPanel.add(selectedMonth);
    }
    private class ListListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {

            String selection = (String) monthList.getSelectedValue();
            selectedMonth.setText(selection);
        }
    }
    public static void main(String[] args) {
        new ListWindow();
    }
}
