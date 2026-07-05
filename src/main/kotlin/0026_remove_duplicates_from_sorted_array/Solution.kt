package leetcode.kotlin.p0026_remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 1

        for (i in 1..<nums.size) {
            if (nums[i] == nums[i - 1]) {
                continue
            } else {
                nums[k] = nums[i]
                k += 1
            }
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
    val inputText = nums.contentToString()
    val actualK = solution.removeDuplicates(nums)
    val actualValues = nums.copyOf(actualK)

    println("Input: nums = $inputText")
    println("Expected: k = $expectedK, nums = ${expectedValues.contentToString()}")
    println("Actual:   k = $actualK, nums = ${actualValues.contentToString()}")
    println()
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
