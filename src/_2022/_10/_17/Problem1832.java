package _2022._10._17;

public class Problem1832 {
    public static void main(String[] args) {
        checkIfPangramTest("thequickbrownfoxjumpsoverthelazydog");
        checkIfPangramTest("leetcode");
    }

    public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 97] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static void checkIfPangramTest(String sentence) {
        System.out.println(checkIfPangram(sentence));
    }
}
