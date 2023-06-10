// Hashmap and array

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        
    }
    public int[] twoSum(int[] nums, int target) {

        // key, value -> target - nums[i] , i
        Map<Integer, Integer> complements = new HashMap <>();

        for (int i = 0; i < nums.length; i++){

            Integer complements_index = complements.get(nums[i]); //get returns the value which is index e
            if (complements_index != null) {
                return new int[] {i, complements_index};
            } else {
                complements.put(target - nums[i], i);
            }
        }
        return nums;
    }
}
