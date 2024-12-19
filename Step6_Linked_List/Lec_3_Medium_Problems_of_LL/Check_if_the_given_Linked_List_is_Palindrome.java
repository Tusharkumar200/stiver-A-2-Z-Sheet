package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Check_if_the_given_Linked_List_is_Palindrome {

    public Node reverseLinkedList(Node head) {

        if(head == null || head.next == null) return head;

        Node newHead = reverseLinkedList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static boolean isPalindrome(Node head) {

    }
    
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
