# LeetCode Solutions

A collection of my LeetCode solutions with examples and complexity analysis.

This repository is a single Gradle project that contains many LeetCode tasks in one shared source tree. Each problem lives in its own package and contains one solution file with the algorithm and a local `main` method for quick checks.

## Project Structure

- Open the repository in IntelliJ IDEA as one Gradle project.
- Java solutions are stored in `src/main/java`.
- Kotlin solutions are stored in `src/main/kotlin`.
- Each problem can be run separately using the green run button next to its `main`.

```text
src/
  main/
    java/
      leetcode/
        p0001_two_sum/
            Solution.java
    kotlin/
      leetcode/
        p0026_remove_duplicates_from_sorted_array/
            Solution.kt
```

## Solved Problems

| # | Problem | Difficulty | Language | Solution Path | LeetCode | Idea | Time | Space |
|---|---|---|---|---|---|---|---|---|
| 0001 | Two Sum | Easy | Java | [`src/main/java/leetcode/p0001_two_sum/Solution.java`](src/main/java/leetcode/p0001_two_sum/Solution.java) | [Link](https://leetcode.com/problems/two-sum/) | Brute-force all pairs and return the first matching indices. | O(n^2) | O(1) |
| 0009 | Palindrome Number | Easy | Java | [`src/main/java/leetcode/p0009_palindrome_number/Solution.java`](src/main/java/leetcode/p0009_palindrome_number/Solution.java) | [Link](https://leetcode.com/problems/palindrome-number/) | Convert the number to a string and compare mirrored characters from both ends. | O(n) | O(n) |
| 0013 | Roman to Integer | Easy | Java | [`src/main/java/leetcode/p0013_roman_to_integer/Solution.java`](src/main/java/leetcode/p0013_roman_to_integer/Solution.java) | [Link](https://leetcode.com/problems/roman-to-integer/) | Scan from right to left and subtract when a smaller symbol appears before a larger one. | O(n) | O(1) |
| 0014 | Longest Common Prefix | Easy | Java | [`src/main/java/leetcode/p0014_longest_common_prefix/Solution.java`](src/main/java/leetcode/p0014_longest_common_prefix/Solution.java) | [Link](https://leetcode.com/problems/longest-common-prefix/) | Grow a prefix from the first string until some word no longer starts with it. | O(n * m) | O(1) |
| 0020 | Valid Parentheses | Easy | Java | [`src/main/java/leetcode/p0020_valid_parentheses/Solution.java`](src/main/java/leetcode/p0020_valid_parentheses/Solution.java) | [Link](https://leetcode.com/problems/valid-parentheses/) | Use a stack to match every closing bracket with the latest opening bracket. | O(n) | O(n) |
| 0021 | Merge Two Sorted Lists | Easy | Java | [`src/main/java/leetcode/p0021_merge_two_sorted_lists/Solution.java`](src/main/java/leetcode/p0021_merge_two_sorted_lists/Solution.java) | [Link](https://leetcode.com/problems/merge-two-sorted-lists/) | Merge two sorted linked lists with a dummy head and pointer rewiring. | O(n + m) | O(1) |
| 0026 | Remove Duplicates from Sorted Array | Easy | Kotlin | [`src/main/kotlin/leetcode/p0026_remove_duplicates_from_sorted_array/Solution.kt`](src/main/kotlin/leetcode/p0026_remove_duplicates_from_sorted_array/Solution.kt) | [Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Use a write pointer to keep only the next unique value in the sorted array. | O(n) | O(1) |

## Running Solutions

In IntelliJ IDEA:

- Import the repository as a Gradle project.
- Open any `Solution.java` or `Solution.kt`.
- Run the task with the green run button next to `main`.

From the terminal:

```bash
gradle build
```

If you prefer, you can also run individual classes from IntelliJ after Gradle imports the project.
