package src.algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algorithms {
    //1. Two Sum
    public int[] twoSum(int[] nums, int target) {
        // Map: <needed number to reach target, index of the current number in the given array>
        Map<Integer, Integer> wantedNumber = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (wantedNumber.containsKey(nums[i])) {
                return new int[]{wantedNumber.get(nums[i]), i};
            }
            wantedNumber.put(target - nums[i], i);
        }
        return null;
    }

    //2. Add two Numbers
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current;
        current = head;

        int carryOver = 0;

        while (l1 != null || l2 != null || carryOver == 1) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            int sum = val1 + val2 + carryOver;
            carryOver = sum/10;

            current.next = new ListNode(sum%10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return head.next;
    }
}
