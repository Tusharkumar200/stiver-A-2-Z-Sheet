package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;


class Node {
    public int data;
    public Node next;

    // Constructor for Node with data and next node
    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor for Node with only data (next set to null)
    public Node(int data1) {
        data = data1;
        next = null;
    }
}
public class Remove_Nth_node_from_the_end_of_a_LL {
    
    public static Node DeleteNthNodefromEnd(Node head, int N) {
       
        Node fast = head;
        Node slow = head;

        for(int i =0; i< N ; i++){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;

        }

        Node delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;

    }

    static void printLL(Node head){

        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        // Delete the Nth node from the end and print the modified linked list
        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }
}
