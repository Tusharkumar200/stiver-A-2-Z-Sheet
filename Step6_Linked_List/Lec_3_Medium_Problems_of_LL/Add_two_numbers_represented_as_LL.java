package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class Add_two_numbers_represented_as_LL {
    
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node num1 = new Node(1);
        num1.next = new Node(2);
        num1.next.next = new Node(3);

        // Creating second linked list: 9 -> 9 -> 9
        // (represents 999)
        Node num2 = new Node(9);
        num2.next = new Node(9);
        num2.next.next = new Node(9);

        Node sum = addTwoLists(num1, num2);
        printList(sum);
    }
}
