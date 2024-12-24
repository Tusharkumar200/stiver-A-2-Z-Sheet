package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

import java.util.Stack;

class ListNode {
    int data;
    ListNode next;
    ListNode prev;
    ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Reverse_a_Linked_List {
    
    // BrutForce Approched
    public static ListNode reverseLinkedList(ListNode head){

        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();  

        while (temp != null) {
            stack.push(temp.data);
            temp  = temp.next;
        }

        //  take out from the stack

        temp = head;

        while (temp != null) {
            
            temp.data = stack.pop();
            temp = temp.next;

        }

        return head;
    }
    

    // optimal approched (iterative approched)
    public static ListNode reverseLL(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            
            ListNode front  = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        // head = reverseLinkedList(head);
        head = reverseLL(head);

        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
