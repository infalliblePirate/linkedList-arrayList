package LIsts;

public class LinkedList {

    private Node head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public LinkedList() {
        head = null;
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public int getByIndex(int index) {
         if (index < 0 || index >= size) {
             throw new ArrayIndexOutOfBoundsException("index is " + index + " the length is " + size);
         }
         int i = 0;
         Node temp = head;
         while (i < index) {
             temp = temp.getNext();
             i++;
         }
         return temp.getValue();
    }


}
