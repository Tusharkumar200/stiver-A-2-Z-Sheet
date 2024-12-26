package Step6_Linked_List.Lec_3_Medium_Problems_of_LL;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Add_two_numbers_represented_as_LL {
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(); // Dummy node to start the result list
        ListNode temp = dummy; // Pointer to build the list
        int carry = 0; // To handle the carry over for sum

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            // Add value from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Add carry from the previous sum
            sum += carry;
            carry = sum / 10; // Update carry for next digit

            // Create a new node with the digit and link it
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        return dummy.next; // Return the head of the resulting list
    }

    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode num1 = new ListNode(1);
        num1.next = new ListNode(2);
        num1.next.next = new ListNode(3);

        // Creating second linked list: 9 -> 9 -> 9
        // (represents 999)
        ListNode num2 = new ListNode(9);
        num2.next = new ListNode(9);
        num2.next.next = new ListNode(9);

        ListNode sum = addTwoNumbers(num1, num2);
        printList(sum);
    }
}
