package Chapter17;


public class InsertionSort {

    public static void insertionSort(Comparable[] array) {
        Comparable unsorted;
        int scan;

        for(int i = 1; i < array.length; i++) {

            unsorted = array[i];
            scan = i;

            while(scan > 0 && array[scan -1].compareTo(unsorted) > 0) {
                array[scan] = array[scan-1];
                scan--;
            }

            array[scan] = unsorted;
        }
    }

    public static void main(String[] args) {

        String[] values = {"Steve", "Bob", "John", "Kerry", "Al", "Chris"};

        System.out.println("Original order:");

        for(String name:values) {
            System.out.print(name + " ");
        }

        insertionSort(values);
        System.out.println();

        System.out.println("Sorted order:");

        for(String name:values) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
