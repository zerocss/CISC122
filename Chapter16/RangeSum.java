package Chapter16;

/**
 * Created by Chris on 3/11/2017.
 */
public class RangeSum {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println("The sum of elements 2 through 5 is " + rangeSum(numbers, 2, 5));
    }

    public static int rangeSum(int[] array, int start, int end) {

        if(start > end) {
            return 0;
        }
        else {
            return array[start] + rangeSum(array, start + 1, end);
        }
    }
}
