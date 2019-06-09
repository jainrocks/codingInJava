/**
 * Created by nitish.jain on 09/06/19.
 */
public class LinkedListLauncher {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;

        linkedList.printList();
    }
}
