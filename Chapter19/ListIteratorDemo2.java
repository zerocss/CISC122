package Chapter19;

import java.util.*;
/**
 * Created by Chris on 4/24/2017.
 */
public class ListIteratorDemo2 {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("Chris");
        nameList.add("David");
        nameList.add("Katherine");
        nameList.add("Kenny");

        System.out.println("Here are the original names.");
        System.out.println(nameList);

        ListIterator<String> it = nameList.listIterator();

        if(it.hasNext()) {

            it.next();

            it.set("Alfonso");
        }

        while(it.hasNext()) {

            it.next();
        }

        it.remove();

        System.out.println("\nHere are the names now.");
        System.out.println(nameList);
    }
}
