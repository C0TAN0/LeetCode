package _2022._10._16;

import _2022._10._15.ListNode;

public class Problem234 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();

        if (head.next == null) {
            return true;
        }
        while (true) {
            if (head == null) {
                break;
            }
            sb.append(head.val);
            head = head.next;
        }

        String strBeforeReverse = sb.toString();
        String strAfterReverse = sb.reverse().toString();

        if (strBeforeReverse.equals(strAfterReverse)) {
            return true;
        }
        return false;
    }
}
