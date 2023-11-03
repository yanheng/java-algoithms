package com.bugai.sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSum01(int[] nums, int target) {
    int[] ans = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (target == nums[i] + nums[j]) {
          ans[0] = i;
          ans[1] = j;
          return ans;
        }
      }
    }
    return ans;
  }

  public int[] twoSum02(int[] nums, int target) {
    int[] ans = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int temp = target - nums[i];
      if (map.containsKey(temp)) {
        ans[0] = i;
        ans[1] = map.get(temp);
        return ans;
      }
    }
    return ans;
  }

  public int[] twoSum03(int[] nums, int target) {
    int[] ans = new int[2];
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int temp = target - nums[i];
      if (map.containsKey(temp)) {
        ans[0] = map.get(temp);
        ans[1] = i;
        return ans;
      } else {
        map.put(nums[i], i);
      }
    }
    return ans;
  }

}
