package AddTwoNumbers;

public class ListNode {
    int val;          // Value of the current node
    ListNode next;    // Pointer to the next node
    // Default constructor
    ListNode() {}
    // Constructor with value
    ListNode(int val) {
        this.val = val;
    }
    // Constructor with value and next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    // Override the toString method to represent the list as a string
    @Override
    public String toString() {
        ListNode head = this;       // Start from the current node
        StringBuilder string = new StringBuilder();  // StringBuilder to build the output
        Boolean cond = true;        // Condition to keep traversing until the end of the list
        // Traverse the linked list and append each node's value to the string
        while (cond) {
            string.append(head.val);    // Append the current node's value
            if (head.next != null)       // If there's a next node, move to the next node
                head = head.next;
            else
                cond = false;           // End of the list
        }
        return string.toString();        // Return the concatenated string of node values
    }
    // Method to add two numbers represented by linked lists l1 and l2
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();    // Create a new list node to store the result
        int val = 0;                      // Variable to store carry over if sum >= 10
        // Case 1: Both l1 and l2 have no next node (i.e., both lists have only one digit left)
        if (l1.next == null && l2.next == null) {
            l3.val = l1.val + l2.val;      // Sum the values of l1 and l2
            if (l3.val >= 10) {            // If sum is greater than or equal to 10
                l3.val = l3.val % 10;      // Keep only the unit place
                l3.next = new ListNode(1); // Add a new node for the carry over
            }
            return l3;
        }
        // Case 2: l1 has only one node, but l2 has more nodes
        else if (l1.next == null && l2.next != null) {
            l3.val = l1.val + l2.val;      // Sum the values of l1 and l2
            if (l3.val >= 10) {            // If sum is greater than or equal to 10
                l3.val = l3.val % 10;      // Keep only the unit place
                val = 1;                   // Carry over 1 to the next digit
            }
            // Recursively add the remaining nodes of l2 and carry value
            l3.next = addTwoNumbers(new ListNode(val), l2.next);
            return l3;
        }
        // Case 3: l2 has only one node, but l1 has more nodes
        else if (l1.next != null && l2.next == null) {
            l3.val = l1.val + l2.val;      // Sum the values of l1 and l2
            if (l3.val >= 10) {            // If sum is greater than or equal to 10
                l3.val = l3.val % 10;      // Keep only the unit place
                val = 1;                   // Carry over 1 to the next digit
            }
            // Recursively add the remaining nodes of l1 and carry value
            l3.next = addTwoNumbers(new ListNode(val), l1.next);
            return l3;
        }
        // Case 4: Both l1 and l2 have multiple digits
        l3.val = l1.val + l2.val;          // Sum the values of l1 and l2
        if (l3.val >= 10) {                // If sum is greater than or equal to 10
            l3.val = l3.val % 10;          // Keep only the unit place
            val = 1;                       // Carry over 1 to the next digit
        }
        l1.next.val += val;                 // Add the carry over to the next node in l1
        // Recursively add the remaining nodes of l1 and l2
        l3.next = addTwoNumbers(l1.next, l2.next);
        return l3;
    }
}