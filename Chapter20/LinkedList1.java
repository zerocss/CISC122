package Chapter20;

public class LinkedList1 {

    private class Node {

        String value;
        Node next;

        Node(String val, Node n) {

            value = val;
            next = n;
        }

        Node(String val) {

            this(val,null);
        }
    }

    private Node first;
    private Node last;

    public LinkedList1() {

        first = null;
        last = null;
    }

    public boolean isEmpty() {

        return first == null;
    }

    public int size() {

        int count = 0;
        Node p = first;

        while(p != null) {

            count++;
            p = p.next;
        }
        return count;
    }

    public void add(String e) {

        if(isEmpty()) {

            first = new Node(e);
            last = first;
        }
        else {

            last.next = new Node(e);
            last = last.next;
        }
    }

    public void add(int index, String e) {

        if(index < 0 || index > size()) {

            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        if(index == 0) {

            first = new Node(e, first);

            if(last == null)
                last = first;
            return;

        }

        Node pred = first;

        for(int k = 1; k <= index - 1; k++) {

            pred = pred.next;
        }

        pred.next = new Node(e, pred.next);

        if(pred.next.next == null)
            last = pred.next;
    }

    public String toString() {

        StringBuilder strBuilder = new StringBuilder();

        //use p to walk down the linked list
        Node p = first;

        while(p != null) {

            strBuilder.append(p.value + "\n");
            p = p.next;
        }

        return strBuilder.toString();
    }

    public String remove(int index) {

        if(index < 0 || index >= size()) {

            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        String element; //The element to return

        if(index == 0) {

            //Removal of the first item in the list
            element = first.value;
            first = first.next;

            if(first == null)
                last = null;
        }
        else {
            /*
            To remove an element other than the first,
            find the predecessor of the element to
            be removed
             */
            Node pred = first;

            //move pred forward index - 1 times
            for(int k = 1; k <= index - 1; k++) {
                pred = pred.next;
            }

            //store the value to return
            element = pred.next.value;

            //Route link around the node to be removed
            pred.next = pred.next.next;

            //Check if pred is now last
            if(pred.next == null)
                last = pred;
        }

        return element;
    }

    public boolean remove(String element) {

        if(isEmpty())
            return false;

        if(element.equals(first.value)) {

            //removal of first item in the list
            first = first.next;

            if(first == null)
                last = null;
            return true;
        }

        //find the predecessor of the element to remove
        Node pred = first;

        while(pred.next != null && !pred.next.value.equals(element)) {

            pred = pred.next;
        }

        //pred.next === null or pred.next.value is element
        if(pred.next == null)
            return false;

        //pred.next.value is element
        pred.next = pred.next.next;

        //Check if pred is now last
        if(pred.next == null)
            last = pred;

        return true;
    }

    public static void reverse(LinkedList1 sourceList){

        if(sourceList.size() <= 1){
            return;
        }

        Node nearNode = sourceList.first;
        Node midNode, farNode;

        midNode = nearNode.next;
        farNode = midNode.next;

        nearNode.next = null;

        while(farNode != null){
            midNode.next = nearNode;

            nearNode = midNode;
            midNode = farNode;
            farNode = farNode.next;
        }

        midNode.next = nearNode;
        sourceList.first = midNode;
    }

    public static void sort(LinkedList1 sourceList) {

        if(sourceList.size() <= 1) {
            return;
        }

        //sort ascending
    }

    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1();

        ll.add("Amy");
        ll.add("Bob");
        ll.add(0,"Al");
        ll.add(2,"Beth");
        ll.add(4,"Carol");
        System.out.println("The elements of the list are:");
        System.out.println(ll);


    }
}
