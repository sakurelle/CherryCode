package leetcode.kotlin.p0026_remove_duplicates_from_sorted_array

import java.util.Arrays

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size == 0) {
            return 0
        }

        var k = 1
        var i = 1
        while (i < nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]
                k += 1
            }
            i += 1
        }

        return k
    }
}

fun main() {
    val solution = Solution()

    runTest(solution, createIntArray(1, 1, 2), 2, createIntArray(1, 2))
    runTest(
        solution,
        createIntArray(0, 0, 1, 1, 1, 2, 2, 3, 3, 4),
        5,
        createIntArray(0, 1, 2, 3, 4)
    )
    runTest(solution, createIntArray(1, 1, 1, 3, 3, 4), 3, createIntArray(1, 3, 4))
}

private fun runTest(solution: Solution, nums: IntArray, expectedK: Int, expectedValues: IntArray) {
    val inputText = Arrays.toString(nums)
    val actualK = solution.removeDuplicates(nums)
    val actualValues = Arrays.copyOf(nums, actualK)

    System.out.println("Input: nums = $inputText")
    System.out.println("Expected: k = $expectedK, nums = ${Arrays.toString(expectedValues)}")
    System.out.println("Actual:   k = $actualK, nums = ${Arrays.toString(actualValues)}")
    System.out.println()
}

private fun createIntArray(vararg values: Int): IntArray {
    val result = IntArray(values.size)
    var i = 0
    while (i < values.size) {
        result[i] = values[i]
        i += 1
    }
    return result
}
