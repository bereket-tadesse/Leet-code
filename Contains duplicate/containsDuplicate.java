import java.util.Arrays;

class ConrainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
        

    }

 
   
    /*
    // using hash map 
    // saves the element and also its number of occurence.

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> seen = new HashMap<>();
            for (int num : nums) {
                if (seen.containsKey(num) && seen.get(num) >= 1)
                    return true;
                seen.put(num, seen.getOrDefault(num, 0) + 1);   // get or default is to return the value associted with the key if it exist or 0 if it doesnot.
            }
            return false;
        }
    }
    */
}