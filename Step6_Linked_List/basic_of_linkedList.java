package Step6_Linked_List;

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

public class basic_of_linkedList {

    private static Node  convertarr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i= 1; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;


    }

    private static int lengthOfLL(Node head){
        int count =0;
        Node temp = head; // use to save the orignal head;

        while(temp != null){

            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    static boolean searchKey( Node head, int key) {
        
        while(head != null){
            if(head.data == key) return true;
            head = head.next;
        }
        return false;
    }

    public static Node RemoveHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }
    
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};

        // Node y = new Node(arr[2]);
        // System.out.println(y.data);

        Node head = convertarr2LL(arr);
        System.out.println(head.data );

        Node temp = head;
        while(temp != null){
            System.out.print ( temp.data + " -> ");
            temp = temp.next;
        }

        // Length of the LL
        int len = lengthOfLL(head);
        System.out.println("length = "+len);

        boolean search = searchKey(head, 40);
        System.out.println(search);
        
        // Remove the Head
         head = RemoveHead(head);
        
        System.out.println(head.data +" ");
         

    }
}
