package Chapter21;

import java.util.*;


public class ArrayQueue {


    private String [] q;
    private int front; //Next item to be removed
    private int rear;   //Next slot to fill
    private int size;   //Number of items in queue

    ArrayQueue(int capacity) {

        q = new String[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }


    public int capacity() {

        return q.length;
    }

    public void enqueue(String s) {

        if(size == q.length)
            throw new StackOverflowError();
        else {
            //add to rear
            size++;
            q[rear] = s;
            rear++;
            if(rear == q.length)
                rear = 0;
        }
    }

    public String peek() {

        if(empty())
            throw new EmptyStackException();
        else
            return q[front];
    }

    public String dequeue() {

        if (empty())
            throw new EmptyStackException();
        else {
            size--;
            //remove front front
            String value = q[front];

            q[front] = null;

            //update front
            front++;
            if(front == q.length)
                front = 0;

            return value;
        }
    }

    public boolean empty() {

        return size == 0;
    }

    public String toString() {

        StringBuilder sBuilder = new StringBuilder();

        sBuilder.append("front = " + front + "; ");
        sBuilder.append("rear = " + rear + "\n");

        for(int k = 0; k < q.length; k++) {
            if(q[k] != null)
                sBuilder.append(k + " " + q[k]);
            else
                sBuilder.append(k + " ?");

            if(k != q.length - 1)
                sBuilder.append("\n");
        }
        return sBuilder.toString();
    }

}
