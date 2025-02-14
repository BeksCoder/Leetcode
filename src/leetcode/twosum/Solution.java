package leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = {2, 3, 4, 2};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalAccessException("No two Sum solution found");
    }}

//    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//            map.put(nums[i], i);
//        }
//
//        throw new IllegalArgumentException("No two sum solution found");
//    }
//}
