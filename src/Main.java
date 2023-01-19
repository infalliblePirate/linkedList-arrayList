import LIsts.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        System.out.println("List size = " + list.getSize());
        /*for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getByIndex(i));
        }*/
        try {
            System.out.println(list.getByIndex(-1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ty loh " + e.getMessage());
        }

    }

}
