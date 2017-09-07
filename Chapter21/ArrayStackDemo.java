package Chapter21;

/**
 * Created by Chris on 4/28/2017.
 */
public class ArrayStackDemo {

    public static void main(String[] args) {

        String str;
        ArrayStack st = new ArrayStack(5);

        System.out.println("Pushing 10 20 onto the stack.");

        st.push(10);
        st.push(20);

        System.out.println("Value at top of the stack is: " + st.peek());

        System.out.println("Popping and printing all values:");

        while(!st.empty())
            System.out.print(st.pop() + " ");
    }
}
