package Step6_Linked_List.Lec_5_Medium_Problems_of_DLL;

import java.util.ArrayList;

class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

public class Find_pairs_with_given_sum_in_doubly_linked_list {
    
    public static Node FindTail(Node head){
        Node tail = head;

        while(tail.next != null){
            tail = tail.next;
        }
        return tail;
    }
    
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> ans;


        return ans;
    }

    public static void main(String[] args) {
        
    }
}
