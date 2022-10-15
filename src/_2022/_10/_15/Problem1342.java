package _2022._10._15;

public class Problem1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (true) {
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                num = num / 2;
                count = count + 1;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}
