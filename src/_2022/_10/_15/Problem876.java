package _2022._10._15;

public class Problem876 {
    public static ListNode middleNode(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }

        ListNode quick = head, slow = head;
        while (quick.next!=null){
            slow=slow.next;
            if(quick.next.next!=null){
                quick=quick.next.next;
            }
            else {
                quick=quick.next;
            }
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
