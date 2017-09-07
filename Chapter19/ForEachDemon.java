package Chapter19;

import java.util.*;

/**
 * Created by Chris on 4/24/2017.
 */
public class ForEachDemon {

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Carlos", "Debby"};

        ArrayList<String> nameList = new ArrayList<>();

        for(String name:names) {
            nameList.add(name);
        }

        nameList.forEach(
            x ->
            {
                System.out.printf("%s %d\n", x, x.length());
            }
        );
    }
}
