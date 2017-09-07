package Chapter19;

import java.util.*;

/**
 * Created by Chris on 4/25/2017.
 */
public class HashSetDemo1 {

    public static void main(String[] args) {

        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Pear");
        fruitSet.add("Strawberry");

        System.out.println("Here are the elements.");
        System.out.println(fruitSet);

        System.out.println("\nTrying to add banana to the set again...");

        fruitSet.add("Banana");
        /*
        if(!fruitSet.add("Banana")) {

            System.out.println("Banana was not added again");
        }*/

        System.out.println("Here are the jawns once more.");
        System.out.println(fruitSet);
    }


}
