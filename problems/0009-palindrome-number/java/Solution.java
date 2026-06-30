public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String str = Integer.toString(x);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        runTest(121, true);
        runTest(-121, false);
        runTest(10, false);
    }

    private static void runTest(int x, boolean expected) {
        boolean actual = isPalindrome(x);

        System.out.println("Input: x = " + x);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}
