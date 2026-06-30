import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        if ((s.length() % 2) != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> stack.push('(');
                case '{' -> stack.push('{');
                case '[' -> stack.push('[');
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
                default -> throw new IllegalArgumentException("Invalid character: " + s.charAt(i));
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, "()", true);
        runTest(solution, "()[]{}", true);
        runTest(solution, "(]", false);
        runTest(solution, "([)]", false);
        runTest(solution, "{[]}", true);
    }

    private static void runTest(Solution solution, String s, boolean expected) {
        boolean actual = solution.isValid(s);

        System.out.println("Input: s = \"" + s + "\"");
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println();
    }
}
