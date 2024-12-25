package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Add_1_to_a_number_represented_by_LL {
    static int addWithCarry(Node head) {
        if (head == null) {
            return 1;

        }

        int res =   head.data + addWithCarry(head.next);
        head.data = res % 10;
        return res / 10;
    }

    static Node addOne(Node head) {
        int carry = addWithCarry(head);
        
        if(carry > 0)
        {
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 9 -> 9 -> 9
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);

        head = addOne(head);

        printList(head);
    }
}
