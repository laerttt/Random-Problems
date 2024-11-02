package AddTwoNumbers;
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
    }
    @Override
    public String toString(){
        ListNode head = this;
        StringBuilder string = new StringBuilder();
        Boolean cond = true;
        while (cond){
            string.append(head.val);
            if(head.next != null)
            head = head.next;
            else
            cond = false;
        }
        return string.toString();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        int val = 0;
        if (l1.next == null && l2.next==null){
            l3.val = l1.val+l2.val;
            if (l3.val >= 10){
                l3.val = l3.val % 10;
                l3.next = new ListNode(1);
            }
            return l3;
        }
        else if (l1.next == null && l2.next!=null){
            l3.val = l1.val+l2.val;
            if(l3.val>=10){
                l3.val = l3.val % 10;
                val = 1;
            }
            l3.next = addTwoNumbers(new ListNode(val), l2.next);
            return l3;
        }
        else if (l1.next != null && l2.next==null){
            l3.val = l1.val+l2.val;
            if(l3.val>=10){
                l3.val = l3.val % 10;
                val = 1;
            }
            l3.next = addTwoNumbers(new ListNode(val), l1.next);
            return l3;
        }
        l3.val = l1.val + l2.val;
        if(l3.val>=10){
            l3.val = l3.val % 10;
            val = 1;
        }
        l1.next.val += val;
        l3.next = addTwoNumbers(l1.next, l2.next);
        return l3;
    }
}
