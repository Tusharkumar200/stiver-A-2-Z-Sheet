package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

class Node {
    // Data stored in the node
    int data;
    
    // Pointer to the next node in the list
    Node next;

    // Constructor with both data and
    // next node as parameters
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data as a
    // parameter, sets next to null
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Sort_a_Linked_List {
    
    static Node sortLL(Node head){

    }

    void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            // Print the data of the current node
            System.out.print(temp.data + " "); 
            // Move to the next node
            temp = temp.next; 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Linked List: 3 2 5 4 1
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
    
        System.out.print("Original Linked List: ");
        printLinkedList(head);
    
        // Sort the linked list
        head = sortLL(head);
    
        System.out.print("Sorted Linked List: ");
        printLinkedList(head);
    }
}
