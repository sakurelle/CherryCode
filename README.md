# LeetCode Solutions

Единый Gradle-проект с решениями задач LeetCode на Java и Kotlin.

## Структура

Репозиторий открывается в IntelliJ IDEA как один Gradle-проект. Каждая задача лежит в отдельной папке формата `XXXX_problem_name` и содержит один файл `Solution.java` или `Solution.kt` с `main` для локальной проверки.

```text
src/main/java/leetcode/java/0001_two_sum/Solution.java
src/main/java/leetcode/java/0009_palindrome_number/Solution.java

src/main/kotlin/leetcode/kotlin/0026_remove_duplicates_from_sorted_array/Solution.kt
```

Так как Java/Kotlin package не может начинаться с цифры, в объявлениях package используется префикс `p`:

```java
package leetcode.java.p0001_two_sum;
```

```kotlin
package leetcode.kotlin.p0026_remove_duplicates_from_sorted_array
```

## Задачи

| # | Название | Сложность | Язык | Решение | LeetCode | Идея алгоритма | Сложность |
|---|---|---|---|---|---|---|---|
| 0001 | Two Sum | Easy | Java | [`Solution.java`](src/main/java/leetcode/java/0001_two_sum/Solution.java) | [LeetCode](https://leetcode.com/problems/two-sum/) | Перебрать все пары чисел и вернуть индексы первой пары с нужной суммой. | Time: O(n^2), Space: O(1) |
| 0009 | Palindrome Number | Easy | Java | [`Solution.java`](src/main/java/leetcode/java/0009_palindrome_number/Solution.java) | [LeetCode](https://leetcode.com/problems/palindrome-number/) | Преобразовать число в строку и сравнить символы с двух концов. | Time: O(n), Space: O(n) |
| 0013 | Roman to Integer | Easy | Java | [`Solution.java`](src/main/java/leetcode/java/0013_roman_to_integer/Solution.java) | [LeetCode](https://leetcode.com/problems/roman-to-integer/) | Сканировать строку справа налево и вычитать меньший символ перед большим. | Time: O(n), Space: O(1) |
| 0014 | Longest Common Prefix | Easy | Java | [`Solution.java`](src/main/java/leetcode/java/0014_longest_common_prefix/Solution.java) | [LeetCode](https://leetcode.com/problems/longest-common-prefix/) | Наращивать префикс первого слова, пока все строки начинаются с него. | Time: O(n * m), Space: O(1) |
| 0020 | Valid Parentheses | Easy | Java | [`Solution.java`](src/main/java/leetcode/java/0020_valid_parentheses/Solution.java) | [LeetCode](https://leetcode.com/problems/valid-parentheses/) | Хранить открывающие скобки в стеке и сопоставлять их с закрывающими. | Time: O(n), Space: O(n) |
| 0021 | Merge Two Sorted Lists | Easy | Java | [`Solution.java`](src/main/java/leetcode/java/0021_merge_two_sorted_lists/Solution.java) | [LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/) | Сливать два отсортированных списка через фиктивную голову и перестановку ссылок. | Time: O(n + m), Space: O(1) |
| 0026 | Remove Duplicates from Sorted Array | Easy | Kotlin | [`Solution.kt`](src/main/kotlin/leetcode/kotlin/0026_remove_duplicates_from_sorted_array/Solution.kt) | [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Использовать указатель записи, оставляя в отсортированном массиве только новые значения. | Time: O(n), Space: O(1) |

## Запуск

В IntelliJ IDEA откройте репозиторий как Gradle-проект, затем запустите нужный `main` рядом с `Solution.java` или `Solution.kt`.

Из терминала:

```bash
./gradlew build
```
