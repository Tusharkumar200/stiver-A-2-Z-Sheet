package Step6_Linked_List.Lec_5_Medium_Problems_of_DLL;

class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

public class Remove_duplicates_from_sorted_DLL {
    
    static Node removeDuplicates(Node head){
        
        Node temp = head;

        while(temp != null && temp.next != null){
            Node nextNode = temp.next;

            while(nextNode != null && nextNode.data == temp.data){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;

            if(nextNode !=null)nextNode.prev = temp;
            temp = temp.next;
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
        head.next = new Node(1);
        head.next.prev = head;
        head.next.next = new Node(2);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(3);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.prev = head.next.next.next;
    
        // Print the original list
        System.out.print("Original list: ");
        printList(head);
    
        // Remove duplicates
        head = removeDuplicates(head);
    
        // Print the modified list
        System.out.print("Modified list: ");
        printList(head);
    }
}
