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
    
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int k, Node head) {
        ArrayList<ArrayList<Integer>> ans;

        if(head == null) return ans;

        Node left = head;
        Node right = FindTail(head);

        while (left.data < right.data) {
            
            if(left.data + right.data == k){

                ans.add(left.data, right.data);
                left = left.next;
                right = right.next;
            }
            else if(left.data + right.data < k){
                left = left.next;
            }
            else{
                right = right.prev;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
