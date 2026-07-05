package leetcode.java.p0013_roman_to_integer;

public class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int left = 0;
        int right;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> {
                    right = left;
                    left = 1000;
                    ans += 1000;
                }
                case 'D' -> {
                    right = left;
                    left = 500;
                    ans += 500;
                }
                case 'C' -> {
                    right = left;
                    left = 100;
                    if (right > left) {
                        ans -= 100;
                    } else {
                        ans += 100;
                    }
                }
                case 'L' -> {
                    right = left;
                    left = 50;
                    ans += 50;
                }
                case 'X' -> {
                    right = left;
                    left = 10;
                    if (right > left) {
                        ans -= 10;
                    } else {
                        ans += 10;
                    }
                }
                case 'V' -> {
                    right = left;
                    left = 5;
                    ans += 5;
                }
                case 'I' -> {
                    right = left;
                    left = 1;
                    if (right > left) {
                        ans -= 1;
                    } else {
                        ans += 1;
                    }
                }
                default -> throw new IllegalArgumentException("Invalid Roman numeral: " + s);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, "III", 3);
        runTest(solution, "LVIII", 58);
        runTest(solution, "MCMXCIV", 1994);
    }

    private static void runTest(Solution solution, String s, int expected) {
        int actual = solution.romanToInt(s);

        System.out.println("Input: s = \"" + s + "\"");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}
