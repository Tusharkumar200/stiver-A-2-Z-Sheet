package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

public class Sort_a_Linked_List {
    

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
