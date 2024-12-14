package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

class Node{

    int data;
    Node next;

    Node(int datas){
        this.data = datas;
        this.next = null;
    }
    Node(int datas , Node next){
        this.data = datas;
        this.next = next;
    }
}

public class Find_middle_element_in_a_Linked_List {
    
    public static Node findMiddle(Node head){

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && slow != null) {
            
         fast = fast.next.next;
         slow = slow.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }

}
