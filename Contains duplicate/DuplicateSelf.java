class DuplicateSelf {
    public boolean containsDuplicate(int[] nums) {
       
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i= 0; i < nums.length ; i++){

            if(hashmap.containsKey(nums[i])){
                return false;
            } else {
                hashmap.put(nums[i],i);
            }
            
        }
    }
}