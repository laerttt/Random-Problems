package AddTwoNumbers;

public class addTwoNumbers {
    public static void main(String args[]) {
        // Create the first linked list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        System.out.println(l1);  // Output the first list, expecting: 243
        // Create the second linked list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(l2);  // Output the second list, expecting: 465
        // Add the two lists and output the result
        // The expected result of adding 243 + 465 = 708
        System.out.println(ListNode.addTwoNumbers(l1, l2));  // Output: 708
    }
}