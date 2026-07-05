package leetcode.kotlin.p0027_remove_elements

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) {
            return 0
        }

        var k = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[k] = nums[i]
                k++
            }
        }

        return k
    }
}

fun main() {
    val solution = Solution()

    runTest(solution, 3, createIntArray(3, 2, 2, 3), 2, createIntArray(2, 2))
    runTest(
        solution,
        2,
        createIntArray(0, 1, 2, 2, 3, 0, 4, 2),
        5,
        createIntArray(0, 1, 4, 0, 3)
    )
}

private fun runTest(solution: Solution, `val`: Int, nums: IntArray, expectedK: Int, expectedValues: IntArray) {
    val inputText = nums.contentToString()
    val actualK = solution.removeElement(nums, `val`)
    val actualValues = nums.copyOf(actualK)

    println("Input: nums = $inputText, val = $`val`")
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