package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

class Node {
    // Data stored in the node
    int data; 
     // Pointer to the next node in the list
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

public class Delete_the_Middle_Node_of_the_LL {
    
    // Brutforce Approched
    public Node deleteMiddle(Node head) {

        Node temp = head;
        int n = 0;

        while(temp != null){
            n++;
            temp = temp.next;
        }

        temp = head;
        int res = n/2;

        while(temp != null){
            res--;

            if(res == 0){
                Node middle = temp.next;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }


        return head;
    }
    
    // Optimal Approched
    public static Node deleteMidd(Node head){
        if (head == null || head.next == null) {
            return null;
        }

       
        Node slow = head;
        Node fast = head;
        fast = head.next.next;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node by skipping it
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Delete_the_Middle_Node_of_the_LL main = new Delete_the_Middle_Node_of_the_LL();
        
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Display the original linked list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting the middle node
        head = main.deleteMiddle(head);

        // Displaying the updated linked list
        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}
