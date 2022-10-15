package _2022._10._15;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))) {
                ans += map.get(s.charAt(i));
            } else {
                ans -= map.get(s.charAt(i));
            }
        }

        return ans;
    }
}

