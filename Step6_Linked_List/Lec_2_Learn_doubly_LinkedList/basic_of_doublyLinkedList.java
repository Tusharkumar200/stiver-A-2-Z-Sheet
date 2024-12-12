package Step6_Linked_List.Lec_2_Learn_doubly_LinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int datas) {
        this.data = datas;
        this.next = null;
        this.prev = null;
    }

    Node(int datas, Node next, Node prev) {
        this.data = datas;
        this.next = next;
        this.prev = prev;
    }
}

public class basic_of_doublyLinkedList {

    public static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node DeleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;

        return head;
    }

    public static Node removeKthElement(Node head, int k) {
        if (head == null || k <= 0) return head;
        if (k == 1) return DeleteHead(head);

        int cnt = 1;
        Node kNode = head;
        while (kNode != null && cnt < k) {
            cnt++;
            kNode = kNode.next;
        }

        if (kNode == null) return head;

        Node prev = kNode.prev;
        Node front = kNode.next;

        if (prev == null && front == null) return null;
        else if (prev == null) return deleteTail(head);

        prev.next = front;
        if (front != null) front.prev = prev;

        kNode.next = null;
        kNode.prev = null;

        return head;
    }

    public static void deleteNode(Node temp){
        Node prev = temp.prev;
        Node front = temp.next;

        if(front == null)
        {
            prev.next = null;
            temp.prev = null;
            return;
        }
        prev.next = front;
        front.prev = prev;
    }
    
    public static Node InsertBeforeHead(Node head, int val) {
        Node newNode = new Node(val, head, null);
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }
   
    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
// insert at Last
    private static Node insertAtTail(Node head, int k) {
        // Create a new node with data 'k'
        Node newNode = new Node(k);
    
        // If the doubly linked list is empty, set 'head' to the new node
        if (head == null) {
            return newNode;
        }
    
        // Traverse to the end of the doubly linked list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
    
        // Connect the new node to the last node in the list
        current.next = newNode;
        newNode.prev = current;
    
        return head;
    }

    public static void ReverseDLL(Node head){
        
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head = convertArr2DLL(arr);
        // head = DeleteHead(head);
        // head = deleteTail(head);
        // head = removeKthElement(head, 5);
        //  deleteNode(head.next);
        head =InsertBeforeHead(head, 84);
        head =insertAtTail(head, 100);

        printLinkedList(head);
    }
}
