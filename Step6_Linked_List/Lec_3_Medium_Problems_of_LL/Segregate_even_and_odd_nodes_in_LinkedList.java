package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val = x;
        next = null;
    }
}

public class Segregate_even_and_odd_nodes_in_LinkedList {
    
  static ListNode head, tail;
static void InsertatLast(int value) // Function for creating a LinkedList
{
    ListNode newnode = new ListNode(value);

    if(head == null){
        head = newnode;
        tail = newnode;
    }
    else{

        tail = tail.next = newnode;
    }
}

static ListNode SegregatetoOddEVen()
{
    ListNode oddHead = new ListNode(-1), oddTail = oddHead;
    ListNode evenHead = new ListNode(-1), evenTail = evenHead;
    ListNode curr = head, temp;

    while(curr != null){

        temp = curr;
        curr = curr.next;
        temp.next = null;

        if (temp.val%2!=0) // If odd Node,append to odd LinkedList
        {
            evenTail.next = temp;
            evenTail = temp;
        }
        else // If Even Node,append to even LinkedList
        {
           
            oddTail.next = temp;
            oddTail = temp;
        }
    }

     evenTail.next = oddHead.next; 
      return evenHead.next;
}

 
// second method 
public ListNode oddEvenList(ListNode head) {
    if (head == null) return null;

    // Initialize pointers for odd and even lists
    ListNode odd = head, even = head.next, evenHead = even;

    // Traverse the list
    while (even != null && even.next != null) {
        odd.next = even.next; // Link odd nodes
        odd = odd.next;       // Move odd pointer
        even.next = odd.next; // Link even nodes
        even = even.next;     // Move even pointer
    }

    // Combine odd and even lists
    odd.next = evenHead;

    return head;
}
static void PrintList(ListNode head) // Function to print the LinkedList
{
    ListNode curr = head;
    for (; curr != null; curr = curr.next)
        System.out.print(curr.val+"-->");
    System.out.println("null");
}
    public static void main(String[] args) {
    InsertatLast(1);
    InsertatLast(2);
    InsertatLast(3);
    InsertatLast(4);
    System.out.println("Intial LinkedList : ");
    PrintList(head);
    ListNode newHead = SegregatetoOddEVen();
    System.out.println("LinkedList After Segregration ");
    PrintList(newHead);
    }
}
