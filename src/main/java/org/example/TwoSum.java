package org.example;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[] { i, k };
                }
            }
        }
        return new int[0];
    }

    public int[] twoSumHashmap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int k = 0; k < nums.length; k++) {
            var secondTerm = target - nums[k];
            if (map.containsKey(secondTerm) &&  map.get(secondTerm) !=k) {
                return new int[] { k, map.get(secondTerm) };
            }
        }
        return new int[0];
    }
}
