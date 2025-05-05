
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Merge_M_sorted_Lists {
    
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        return divideAndConquer(lists, 0, lists.length - 1);
    }

    private ListNode divideAndConquer(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];

        int mid = left + (right - left) / 2;
        ListNode l1 = divideAndConquer(lists, left, mid);
        ListNode l2 = divideAndConquer(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }
    public static void main(String[] args) {
        // Create sample input: an array of k sorted linked lists
        ListNode[] lists = new ListNode[3];

        // First sorted list: 1 -> 4 -> 5
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));

        // Second sorted list: 1 -> 3 -> 4
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Third sorted list: 2 -> 6
        lists[2] = new ListNode(2, new ListNode(6));

        // Merge all k sorted lists
        Merge_M_sorted_Lists solution = new Merge_M_sorted_Lists();
        ListNode mergedList = solution.mergeKLists(lists);

        // Print the merged sorted list
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}
