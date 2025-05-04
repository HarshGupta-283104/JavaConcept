
class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class CreationOfAnode {

    public static void main(String[] args) {
        // Creating nodes with predefined input
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Linking nodes
        first.next = second;
        second.next = third;

        // Printing the linked list
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}