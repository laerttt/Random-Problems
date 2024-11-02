package AddTwoNumbers;
public class addTwoNumbers {
    public static void main(String args[]){
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        System.out.println(l1);
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(l2);
        System.out.println(ListNode.addTwoNumbers(l1,l2));
    }   
}