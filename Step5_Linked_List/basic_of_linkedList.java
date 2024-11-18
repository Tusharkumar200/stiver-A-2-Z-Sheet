package Step5_Linked_List;

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
    
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        Node y = new Node(arr[2]);
        System.out.println(y.data);

    }
}
