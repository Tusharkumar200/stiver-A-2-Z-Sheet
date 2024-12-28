package Step6_Linked_List.Lec_4_Hard_Problem_of_LL;

class Node {
    // Data stored in the node
    int data;
    // Pointer to the next
    // node in the list
    Node next;

    // Constructor with both data
    // and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse_Linked_List_in_groups_of_Size_K {

    static Node reverseLinkedList(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    static Node getKthNode(Node temp, int k) {
        k = 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    static Node kReverse(Node head, int k) {

        Node temp = head;
        Node prevLast = null;

        while (temp != null) {
            Node kThNode = getKthNode(temp, k);

            if (kThNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }

                break;
            }

            Node nextNode = kThNode.next;
            kThNode.next = null;
            reverseLinkedList(temp);

            if (temp == head) {
                head = kThNode;

            } else {
                prevLast.next = kThNode;
            }

            prevLast = temp;
            temp = nextNode;

        }
        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(2);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = kReverse(head, 4);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }

}
