package _2022._10._16;

import java.util.HashMap;
import java.util.Map;

public class Problem383 {
    public static void main(String[] args) {
        canConstructTest("a","b");
        canConstructTest("aa","ab");
        canConstructTest("aa","aab");
        canConstructTest("aab","baa");
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 'a'; i <= 'z'; i++) {
            char c = (char) i;

            ransomNoteMap.put(c,0);
            magazineMap.put(c,0);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            ransomNoteMap.put(ransomNote.charAt(i), (ransomNoteMap.get(ransomNote.charAt(i)) + 1));
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), (magazineMap.get(magazine.charAt(i)) + 1));
        }

        for (int i = 'a'; i <= 'z'; i++) {
            char c = (char) i;

            if (ransomNoteMap.get( c) > magazineMap.get(c)) {
                return false;
            }
        }

        return true;
    }

    public static void canConstructTest(String ransomNote, String magazine) {
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
