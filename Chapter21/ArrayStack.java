package Chapter21;

import java.util.EmptyStackException;

/**
 * Created by Chris on 4/28/2017.
 */
public class ArrayStack {

    private int[] s; //holds stack elements
    private int top; //Stack top pointer

    public ArrayStack(int capacity) {

        s = new int[capacity];
        top = 0;
    }

    public boolean empty() {

        return top == 0;
    }

    public void push(int x) {

        if(top == s.length)
            throw new StackOverflowError();
        else {
            s[top] = x;
            top++;
        }
    }

    public int pop() {
        if(empty())
            throw new EmptyStackException();
        else {
            top--;
            return s[top];
        }
    }

    int peek() {
        if(empty())
            throw new EmptyStackException();
        else {
            return s[top-1];
        }
    }
}
