/**
 * Created by nitish.jain on 31/05/19.
 */
public class LinkedList {
    Node head;

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println("null");
    }
}
