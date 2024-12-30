
class Node {
    int num;
    Node next;
    Node(int a) {
      num = a;
      next = null;
    }
  }

public class Rotate_a_LL {

    static Node insertNode(Node head,int val) {

    }

    static Node rotateRight(Node head,int k) {

    }    

    static void printList(Node head) {
        while(head.next != null) {
            System.out.print(head.num+"->");
            head = head.next;
        } 
        System.out.println(head.num);
        
    }
    
    public static void main(String[] args) {
        Node head = null;
    //inserting Node
    head=insertNode(head,1);
    head=insertNode(head,2);
    head=insertNode(head,3);
    head=insertNode(head,4);
    head=insertNode(head,5);
    
    System.out.println("Original list: ");
    printList(head);
    
    int k = 2;
    Node newHead = rotateRight(head,k);//calling function for rotating right 
    of the nodes by k times
    
    System.out.println("After "+k+" iterations: ");
    printList(newHead);
    }
}
