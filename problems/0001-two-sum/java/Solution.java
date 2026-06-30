import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, new int[] {2, 7, 11, 15}, 9, new int[] {0, 1});
        runTest(solution, new int[] {3, 2, 4}, 6, new int[] {1, 2});
        runTest(solution, new int[] {3, 3}, 6, new int[] {0, 1});
    }

    private static void runTest(Solution solution, int[] nums, int target, int[] expected) {
        int[] actual = solution.twoSum(nums, target);

        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual:   " + Arrays.toString(actual));
        System.out.println();
    }
}
