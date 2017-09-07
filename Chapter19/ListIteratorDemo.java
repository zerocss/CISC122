package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Chris on 4/24/2017.
 */
public class ListIteratorDemo {

    public static void main(String[] args) {

        String[] names = {"Chris", "David", "Katherine", "Kenny"};
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println("Here are the original names.");
        System.out.println(nameList);

        ListIterator<String> it = nameList.listIterator();

        while(it.hasNext()) {
            String str = it.next();

            if(str.equalsIgnoreCase("Chris")) {

                it.add("Darlene");
                break;
            }
        }

        System.out.println("\nHere are the new names now.");
        System.out.println(nameList);
    }
}
