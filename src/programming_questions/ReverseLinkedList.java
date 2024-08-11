package programming_questions;

import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);

        LinkedList<Integer> reverseLinkedList = new LinkedList<>();

        //descendingIterator traverses the list from last (tail) to first (head)
        //reverseLinkedList::add -> method reference
        //:: is the method reference operator
        linkedList.descendingIterator().forEachRemaining(reverseLinkedList::add);

        //Lambda expression
        linkedList.descendingIterator().forEachRemaining(element -> reverseLinkedList.add(element));

        //Explicit loop
        for (Integer element : linkedList) {
            reverseLinkedList.addFirst(element);
        }

        System.out.println(reverseLinkedList);
    }
}
