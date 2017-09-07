package Chapter19;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by Chris on 4/24/2017.
 */
public class IteratorDemo {

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Carlos", "Debby"};

        ArrayList<String> nameList = new ArrayList<>();

        for(String name:names) {

            nameList.add(name);
        }

        Consumer<String> action = x ->
        {
            System.out.printf("%s\n", x);
        };

        Iterator<String> iter = nameList.iterator();

        while (iter.hasNext()) {

            String name = iter.next();
            System.out.printf("%s %d\n", name, name.length());

            if(name.equals("Bob")) {
                iter.forEachRemaining(action);
            }
        }
    }
}
