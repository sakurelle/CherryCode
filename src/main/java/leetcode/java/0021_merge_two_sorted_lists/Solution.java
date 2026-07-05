package leetcode.java.p0021_merge_two_sorted_lists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode result = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }

        if (list1 != null) {
            result.next = list1;
        } else {
            result.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        runTest(solution, buildList(1, 2, 4), buildList(1, 3, 4), "[1, 1, 2, 3, 4, 4]");
        runTest(solution, buildList(), buildList(), "[]");
        runTest(solution, buildList(), buildList(0), "[0]");
    }

    private static void runTest(Solution solution, ListNode list1, ListNode list2, String expected) {
        String list1Text = listToString(list1);
        String list2Text = listToString(list2);
        ListNode actual = solution.mergeTwoLists(list1, list2);

        System.out.println("Input: list1 = " + list1Text + ", list2 = " + list2Text);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + listToString(actual));
        System.out.println();
    }

    private static ListNode buildList(int... values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    private static String listToString(ListNode head) {
        StringBuilder builder = new StringBuilder("[");
        ListNode current = head;

        while (current != null) {
            builder.append(current.val);
            current = current.next;
            if (current != null) {
                builder.append(", ");
            }
        }

        builder.append("]");
        return builder.toString();
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
