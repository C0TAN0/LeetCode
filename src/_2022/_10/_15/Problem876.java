package _2022._10._15;

public class Problem876 {
    public static void main(String[] args) {

    }
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

