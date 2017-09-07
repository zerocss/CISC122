package Chapter18;

import java.util.*;


public class MyList <T extends Comparable> {

    private ArrayList<T> list;

    public MyList() {

        list = new ArrayList<T>();
    }

    public void add(T item) {

        list.add(item);
    }

    public void sort(ArrayList<T> array) {

        Collections.sort(array);
    }

    public T smallest() {

        sort(list);

        return list.get(0);
    }

    public T largest() {

        sort(list);

        return list.get(list.size() - 1);
    }


    public static void main(String[] args) {

        MyList<Integer> numbers = new MyList<>();

        numbers.add(10);
        numbers.add(3);
        numbers.add(86);
        numbers.add(1024);
        numbers.add(43);

        MyList<Double> decimals = new MyList<>();

        decimals.add(3.14);
        decimals.add(7.864);
        decimals.add(87.684);
        decimals.add(784.561);
        decimals.add(1.2345);

        MyList<String> strings = new MyList<>();

        strings.add("Test");
        strings.add("Burgers");
        strings.add("Fries");
        strings.add("Pizza");
        strings.add("Cheesesteak");

        System.out.println("The smallest integer is: " + numbers.smallest());
        System.out.println("The largest integer is: " + numbers.largest());

        System.out.println("The smallest double is: " + decimals.smallest());
        System.out.println("The largest double is: " + decimals.largest());

        System.out.println("The smallest string is: " + strings.smallest());
        System.out.println("The largest string is: " + strings.largest());


    }
}
