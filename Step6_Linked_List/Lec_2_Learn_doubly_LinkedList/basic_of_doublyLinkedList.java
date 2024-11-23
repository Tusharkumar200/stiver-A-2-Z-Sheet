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
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        Node head = convertArr2DLL(arr);

    }
}
