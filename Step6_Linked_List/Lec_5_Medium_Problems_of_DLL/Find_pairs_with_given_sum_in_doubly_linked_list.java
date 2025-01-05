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
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(head == null) return ans;

        Node left = head;
        Node right = FindTail(head);

        while (left.data < right.data) {
            
            if(left.data + right.data == k){

                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);
                left = left.next;
                right = right.prev;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(5);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
    
        // Define the sum to find pairs for
        int k = 7;
    
        // Find pairs with the given sum
        ArrayList<ArrayList<Integer>> pairs = findPairsWithGivenSum(k,head);
    
        // Print the pairs
        System.out.println("Pairs with sum " + k + ":");
        for (ArrayList<Integer> pair : pairs) {
            System.out.println(pair.get(0) + ", " + pair.get(1));
        }
    }
}
