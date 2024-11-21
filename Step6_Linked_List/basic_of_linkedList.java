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
        if(arr.length == 0) return null;
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

    
    //* Deletion in the Linklist. 
    public static Node RemoveHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }
    
    public static Node RemoveTail(Node head){

        if(head == null || head.next == null) return head;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        return head;
    }
    
    public static Node RemoveK(Node head , int k){
        if(head == null)return head;
        if(k == 1){
            Node temp = head;
            temp = temp.next;
            return head;
        }

        int count = 0;
        Node temp  = head;
        Node prev = null;

        while(temp != null){
            count++;

            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }

    public static Node RemoveElement(Node head , int el){
        if(head == null)return head;
        if(head.data == el){
            Node temp = head;
            temp = temp.next;
            return head;
        }

        
        Node temp  = head;
        Node prev = null;

        while(temp != null){
            

            if(temp.data == el){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }

    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};

        // Node y = new Node(arr[2]);
        // System.out.println(y.data);

        Node head = convertarr2LL(arr);
        // System.out.println(head.data );

        // Node temp = head;
        // while(temp != null){
        //     System.out.print ( temp.data + " -> ");
        //     temp = temp.next;
        // }

        // Length of the LL
        int len = lengthOfLL(head);
        System.out.println("length = "+len);

        // boolean search = searchKey(head, 40);
        // System.out.println(search);
        
        // Remove the Head
        // head = RemoveHead(head);
        // Remove tail
        //  head = RemoveTail(head);
        
        // System.out.println(head.data +" tail removed");

         head = RemoveK(head, 2);
        System.out.println(head +" k elment removed ");

        head = RemoveElement(head , 20);
        System.out.println(head);
        
        
        

    }

    
}
