package Step6_Linked_List.Lec_2_Learn_doubly_LinkedList;

 class Node{
    int data;
    Node next;
    Node prev;

    Node(int datas){
        this.data = datas;
        this.next = null;
        this.prev = null;
    }
    Node(int datas , Node next , Node prev){
        this.data = datas;
        this.next = next;
        this.prev  = prev;
    }
}

public class basic_of_doublyLinkedList {
    
    public static Node convertArr2DLL(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for( int i = 1; i<arr.length; i++){
           Node temp = new Node(arr[i], null, prev);
           prev.next = temp;
           prev = temp;
        }
        return head;
    }

    public static Node DeleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }
    public static Node deleteTail(Node head){
        if(head == null || head.next == null)return null;
        Node tail = head;

        while(tail.next != null){
            tail = tail.next;

        }
        Node newTail= tail.prev;
        newTail.next = null;
        tail.prev = null;

        return head;
    }
    
    private static void printLinkedList(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        Node head = convertArr2DLL(arr);
        head = DeleteHead(head);
        printLinkedList(head);
    }
}
