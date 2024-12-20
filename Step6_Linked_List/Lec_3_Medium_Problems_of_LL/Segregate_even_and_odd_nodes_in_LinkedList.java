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
    

    static void PrintList(ListNode head) // Function to print the LinkedList
{
    ListNode curr = head;
    for (; curr != null; curr = curr.next)
        System.out.print(curr.val+"-->");
    System.out.println("null");
}
    public static void main(String[] args) {
        
    }
}
