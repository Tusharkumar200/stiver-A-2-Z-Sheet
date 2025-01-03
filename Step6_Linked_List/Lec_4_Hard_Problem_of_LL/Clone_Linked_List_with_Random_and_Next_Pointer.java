

class Node {
    // Data stored in the node
    int data;
    // Pointer to the next node
    Node next;
    // Pointer to a random
    // node in the list
    Node random;

    // Constructors for Node class
    Node() {
        // Default constructor
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    Node(int x) {
        // Constructor with data
        this.data = x;
        this.next = null;
        this.random = null;
    }

    Node(int x, Node nextNode, Node randomNode) {
        // Constructor with data,
        // next, and random pointers
        this.data = x;
        this.next = nextNode;
        this.random = randomNode;
    }
}

public class Clone_Linked_List_with_Random_and_Next_Pointer {
    
    void insertCopyInBetween(Node head) {
        Node temp = head;
        while(temp != null){
            Node nextElement = temp.next;
            Node copy = new Node(temp.data);
            copy.next = nextElement;
            temp.next = copy;
            temp = nextElement;
        }
    }

    void connectRandomPointers(Node head) {

    }

    Node getDeepCopyList(Node head) {

        return head;
    }

    Node cloneLL(Node head) {

        return head;
    }

    void printClonedLinkedList(Node head) {
        while (head != null) {
            System.out.print("Data: " + head.data);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.data);
            } else {
                System.out.print(", Random: null");
            }
            System.out.println();
            // Move to the next node
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Example linked list: 7 -> 14 -> 21 -> 28
    Node head = new Node(7);
    head.next = new Node(14);
    head.next.next = new Node(21);
    head.next.next.next = new Node(28);

    // Assigning random pointers
    head.random = head.next.next;
    head.next.random = head;
    head.next.next.random = head.next.next.next;
    head.next.next.next.random = head.next;

    System.out.println("Original Linked List with Random Pointers:");
    printClonedLinkedList(head);

    // Clone the linked list
    Node clonedList = cloneLL(head);

    System.out.println("\nCloned Linked List with Random Pointers:");
    printClonedLinkedList(clonedList);
    }
}
