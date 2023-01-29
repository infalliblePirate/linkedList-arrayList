package Lists;

public class LinkedList<E> {

    private Node<E> head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public LinkedList() {
        head = null;
    }

    public void add(E value) {

        if (head == null) {
            head = new Node<>(value);
            // here we set that next = null
        } else {
            Node<E> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<>(value));
            // we created a reference to the last one
        }
        size++;
    }

    public E getByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index is " + index + " the length is " + size);
        }
        return getNodeByIndex(index).getValue();
    }

    public void removeByIndex(int index) {
        if (head == null) {
            throw new UnsupportedOperationException("list is empty");
        }
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index is " + index + " the length is " + size);
        }

        if (index == 0) {
            head = head.getNext();
        } else {

            Node<E> temp = getNodeByIndex(index - 1);

            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }

    public void addByIndex(E value, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("index is " + index + " the length is " + size);
        }
        Node<E> newNode = new Node<>(value);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else if (index == size) {
            add(value);
        } else {

            Node<E> temp = getNodeByIndex(index - 1);

            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }

        size++;

    }

    public void setByIndex(E value, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index is " + index + " the length is " + size);
        }
        getNodeByIndex(index).setValue(value);
    }

    private Node<E> getNodeByIndex(int index) {
        int i = 0;
        Node<E> temp = head;
        while (i < index) {
            temp = temp.getNext();
            i++;
        }
        return temp;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder str = new StringBuilder("[" + head.getValue());
        Node<E> temp = head.getNext();
        while (temp != null) {
            str.append(", ").append(temp.getValue());
            temp = temp.getNext();
        }
        return str.append("]\n").toString();
    }

}
