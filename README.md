# LeetCode Solutions

A collection of my LeetCode solutions with examples and complexity analysis.

This repository is organized by problem number and keeps each language solution in its own folder, so it is easy to expand later with Kotlin, Python, or other languages alongside `java/`.

Each Java solution is stored in a single `Solution.java` file that contains both the LeetCode-style solution method and a `main` method with example test cases.

## Solved Problems

| # | Problem | Difficulty | Language | Solution Folder | LeetCode | Idea | Time | Space |
|---|---|---|---|---|---|---|---|---|
| 0001 | Two Sum | Easy | Java | [problems/0001-two-sum](problems/0001-two-sum) | [Link](https://leetcode.com/problems/two-sum/) | Brute-force all pairs and return the first matching indices. | O(n^2) | O(1) |
| 0009 | Palindrome Number | Easy | Java | [problems/0009-palindrome-number](problems/0009-palindrome-number) | [Link](https://leetcode.com/problems/palindrome-number/) | Convert the number to a string and compare mirrored characters from both ends. | O(n) | O(n) |
| 0013 | Roman to Integer | Easy | Java | [problems/0013-roman-to-integer](problems/0013-roman-to-integer) | [Link](https://leetcode.com/problems/roman-to-integer/) | Scan from right to left and subtract when a smaller symbol appears before a larger one. | O(n) | O(1) |
| 0014 | Longest Common Prefix | Easy | Java | [problems/0014-longest-common-prefix](problems/0014-longest-common-prefix) | [Link](https://leetcode.com/problems/longest-common-prefix/) | Grow a prefix from the first string until some word no longer starts with it. | O(n * m) | O(1) |
| 0020 | Valid Parentheses | Easy | Java | [problems/0020-valid-parentheses](problems/0020-valid-parentheses) | [Link](https://leetcode.com/problems/valid-parentheses/) | Use a stack to match every closing bracket with the latest opening bracket. | O(n) | O(n) |
| 0021 | Merge Two Sorted Lists | Easy | Java | [problems/0021-merge-two-sorted-lists](problems/0021-merge-two-sorted-lists) | [Link](https://leetcode.com/problems/merge-two-sorted-lists/) | Merge two sorted linked lists with a dummy head and pointer rewiring. | O(n + m) | O(1) |

## Included Problems

- Two Sum
- Palindrome Number
- Roman to Integer
- Longest Common Prefix
- Valid Parentheses
- Merge Two Sorted Lists

## Repository Structure

Each problem has its own folder, and every language stays next to other future languages:

```text
problems/
  0001-two-sum/
    java/
      Solution.java
    kotlin/
      Solution.kt
    python/
      solution.py
```

## Run Java Examples

Example for `0001-two-sum`:

1. Open a terminal in `problems/0001-two-sum/java`
2. Run `javac Solution.java`
3. Run `java Solution`
