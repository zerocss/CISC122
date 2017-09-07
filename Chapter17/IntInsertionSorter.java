package Chapter17;

/**
 * Created by Chris on 4/2/2017.
 */
public class IntInsertionSorter {

    public static void insertionSort(int[] array) {
        int unsorted;
        int scan;

        for(int i = 1; i < array.length; i++) {

            unsorted = array[i];
            scan = i;

            while(scan > 0 && array[scan -1] > unsorted) {
                array[scan] = array[scan-1];
                scan--;
            }

            array[scan] = unsorted;
        }
    }

    public static void main(String[] args) {

        int[] values = {5,1,3,6,4,2};

        System.out.println("Original order:");

        for(int num:values) {
            System.out.print(num + " ");
        }

        insertionSort(values);
        System.out.println();

        System.out.println("Sorted order:");

        for(int num:values) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
