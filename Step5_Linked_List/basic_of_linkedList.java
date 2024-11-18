package Step5_Linked_List;

class Node{

    int data;
    Node next;

    Node(int datas){
        this.data = datas;
        this.next = null;
    }
}

public class basic_of_linkedList {
    
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        Node y = new Node(arr[2]);
        System.out.println(y.data);

    }
}
