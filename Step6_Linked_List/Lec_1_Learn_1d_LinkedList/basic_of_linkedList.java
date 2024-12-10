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

    private static Node convertarr2LL(int arr[]){
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
// random insertion is left
    private static int lengthOfLL(Node head){
        int count =0;
        Node temp = head; // use to save the original head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    static boolean searchKey(Node head, int key) {
        while(head != null){
            if(head.data == key) return true;
            head = head.next;
        }
        return false;
    }

    //* Deletion in the LinkedList. 
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
        temp.next = null; // fix: actually remove the tail
        return head;
    }
    
    public static Node RemoveK(Node head , int k){
        if(head == null) return head;
        if(k == 1){
            return head.next;
        }

        int count = 1;
        Node temp = head;
        while(temp != null && count < k - 1){
            temp = temp.next;
            count++;
        }

        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }

    public static Node RemoveElement(Node head , int el){
        if(head == null) return head;
        if(head.data == el){
            return head.next;
        }

        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == el){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertHead(Node head , int val){
        Node temp = new Node(val, head);
        return temp; 
    }

    public static Node insertTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public static Node insertPostion(Node head, int el, int k){
        if(head == null){
            if(k == 1){
                return new Node(el);
            }
            else{
                return head;
            }
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if(cnt == (k-1)){
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertBeforeValue(Node head, int el, int val){
        if(head == null){return head;}

        
        Node temp = head;
        while (temp.next != null) {
        
            if(temp.next.data == val){
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
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

        Node head = convertarr2LL(arr);
        printLinkedList(head);

        int len = lengthOfLL(head);
        System.out.println("length = " + len);

        head = RemoveK(head, 2);
        System.out.print("After removing 2nd element: ");
        printLinkedList(head);

        head = insertPostion(head, 80, 3);
        System.out.print("After inserting 80 at position 3: ");
        printLinkedList(head);

        head = insertBeforeValue(head, 875, 30);
        System.out.print("insert 875 Before Value  30 : ");
        printLinkedList(head);
    }
}
