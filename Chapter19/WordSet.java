package Chapter19;

import javax.swing.*;
import java.util.*;

public class WordSet {

    public static void main(String[] args) {

        String input; //input from JOptionPane
        String[] line; //input split in to an array

        input = JOptionPane.showInputDialog(null, "Enter anything and duplicate entries will be removed:");

        //Split the input into an array
        line = input.split(" ");

        JOptionPane.showMessageDialog(null,"Here is the original input:\n" + input);

        JOptionPane.showMessageDialog(null, "Here is the input with duplicates" +
                " removed:\n" + Words(line));

    }

    public static SortedSet Words(String[] array) {

        SortedSet<String> removeDup = new TreeSet<>();

        //Iterate through the array to add to SortedSet
        for(String word:array) {

            removeDup.add(word.toLowerCase());
        }
        return removeDup;

    }
}
