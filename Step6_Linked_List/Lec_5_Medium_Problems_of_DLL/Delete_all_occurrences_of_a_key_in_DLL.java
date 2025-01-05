package Step6_Linked_List.Lec_5_Medium_Problems_of_DLL;

// Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}
public class Delete_all_occurrences_of_a_key_in_DLL {
    
    static Node deleteAllOccurOfX(Node head, int x) {

        Node temp = head;
        while (temp != null) {
            
            if(temp.data == x){

                if(temp == head){
                    head = head.next;
                }
                Node nextNode = temp.next;
                Node prevNode = temp.prev;
                
                if(nextNode != null){
                    nextNode.prev = prevNode;
                }
                if(prevNode != null){
                    prevNode.next = nextNode;
                }

                temp = nextNode;

            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }


    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;
    
        // Print the original list
        System.out.print("Original list: ");
        printList(head);
    
        // Delete all occurrences of key 2
        int key = 2;
        head = deleteAllOccurOfX(head, key);
    
        // Print the modified list
        System.out.print("Modified list: ");
        printList(head);
    }
}
