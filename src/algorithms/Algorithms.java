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
}
