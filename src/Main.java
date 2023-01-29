import Lists.LinkedList;
import Lists.Person;

public class Main {
    public static void main(String[] args) {
        /*LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        printList(list);

        try {
            System.out.println(list.getByIndex(-1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ty loh " + e.getMessage());
        }

        list.removeByIndex(0);
        printList(list);
        list.removeByIndex(3);
        //printList(list);
        System.out.print(list);
        list.add(15);
        System.out.print(list);

        list.addByIndex(222, 0);
        System.out.print(list);

        list.addByIndex(222, list.getSize());
        System.out.print(list);

        list.addByIndex(222, 3);
        System.out.print(list);

        list.setByIndex(-10, -1);
        System.out.println(list);*/

        var list = new LinkedList<Person>();
        list.add(new Person(22, "Bob"));
        list.add(new Person(56, "Hannah"));
        list.add(new Person(38, "Charlie"));
        System.out.println(list.getByIndex(0));
        System.out.println(list);


    }

    private static void printList(LinkedList<Integer> list) {
        System.out.println("List size = " + list.getSize());
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getByIndex(i));
        }
    }

}
