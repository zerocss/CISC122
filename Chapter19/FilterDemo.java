package Chapter19;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Chris on 4/24/2017.
 */
public class FilterDemo {

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Carlos", "Debby"};

        ArrayList<String> nameList = new ArrayList<>();

        for(String name: names) {

            nameList.add(name);
        }

        Predicate<String> filter = x -> x.length() <= 4;

        nameList.removeIf(filter);

        System.out.println(nameList);
    }
}
