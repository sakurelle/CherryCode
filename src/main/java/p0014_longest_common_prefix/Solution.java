package leetcode.p0014_longest_common_prefix;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        for (int i = 0; i <= strs[0].length(); i++) {
            for (String str : strs) {
                if (!str.startsWith(strs[0].substring(0, i))) {
                    return result;
                }
            }
            result = strs[0].substring(0, i);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new String[] {"flower", "flow", "flight"}, "fl");
        runTest(solution, new String[] {"dog", "racecar", "car"}, "");
        runTest(solution, new String[] {"interspecies", "interstellar", "interstate"}, "inters");
    }

    private static void runTest(Solution solution, String[] strs, String expected) {
        String actual = solution.longestCommonPrefix(strs);

        System.out.println("Input: strs = " + Arrays.toString(strs));
        System.out.println("Expected: \"" + expected + "\"");
        System.out.println("Actual:   \"" + actual + "\"");
        System.out.println();
    }
}
