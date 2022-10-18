package _2022._10._18;

public class Problem9 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str1 = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        String str2 = sb.reverse().toString();

        return str1.equals(str2);
    }
}
