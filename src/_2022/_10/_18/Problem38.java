package _2022._10._18;

public class Problem38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println("===");
        System.out.println(countAndSay(2));
        System.out.println("===");
        System.out.println(countAndSay(3));
        System.out.println("===");
        System.out.println(countAndSay(4));
        System.out.println("===");
        System.out.println(countAndSay(5));
        System.out.println("===");
        System.out.println(countAndSay(6));

    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        if (n == 2) {
            return "11";
        }

        int t = 3;
        String result = "11";
        while (t <= n) {
            int count = 1;
            String str = "";
            for (int i = 1; i < result.length(); i++) {
                if (result.charAt(i - 1) != result.charAt(i) && i == result.length() - 1) {
                    str += String.valueOf(count) + result.charAt(i - 1);
                    count = 0;
                    count = count + 1;
                    str += String.valueOf(count) + result.charAt(i);
                } else if (result.charAt(i - 1) != result.charAt(i) && i != result.length() - 1) {
                    str += String.valueOf(count) + result.charAt(i - 1);
                    count = 0;
                    count = count + 1;
                } else if (result.charAt(i - 1) == result.charAt(i) && i != result.length() - 1) {
                    count = count + 1;
                } else if (result.charAt(i - 1) == result.charAt(i) && i == result.length() - 1) {
                    count = count + 1;
                    str += String.valueOf(count) + result.charAt(i - 1);
                    count = 0;
                }
            }
            result = str;
            t++;
        }

        return result;
    }
}
