class Node {
    int data;
    Node next;
    Node child;

    
    Node() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node(int x) {
        this.data = x;
        this.next = null;
        this.child = null;
    }

    Node(int x, Node nextNode, Node childNode) {
        this.data = x;
        this.next = nextNode;
        this.child = childNode;
    }
}


public class FlattenLinkedList {
    

    public static void main(String[] args) {
        Node head = new Node(5);
        head.child = new Node(14);

        head.next = new Node(10);
        head.next.child = new Node(4);

        head.next.next = new Node(12);
        head.next.next.child = new Node(20);
        head.next.next.child.child = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.child = new Node(17);

        // Print the original
        // linked list structure
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten the linked list
        // and print the flattened list
        Node flattened = flattenLinkedList(head);
        System.out.println("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}
