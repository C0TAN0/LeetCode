package _2022._10._16;

import java.util.ArrayList;
import java.util.List;

public class Problem412 {
    public static void main(String[] args) {
        System.out.println("n = 3");
        fizzBuzzTest(3);
        System.out.println("=====");
        System.out.println("n = 5");
        fizzBuzzTest(5);
        System.out.println("=====");
        System.out.println("n = 15");
        fizzBuzzTest(15);
        System.out.println("=====");
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void fizzBuzzTest(int n) {
        List<String> test = fizzBuzz(n);

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
    }
}
