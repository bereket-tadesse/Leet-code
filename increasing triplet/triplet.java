class triplet {
    public static void main(String[] args) {
        System.out.println(triplet.increasingTriplet(new int[]{1,5,0,4,1,3}));
    }
    public static boolean increasingTriplet(int[] nums) {
        int i= 0;
        while(i < nums.length){
           int currentValue = nums[i];
            int j=i+1;
            int count = 0;
            while(j < nums.length){
                if(nums[j] > currentValue){
                    count++;
                    currentValue = nums[j];
                     if(count == 2){
                         return true;
                     }
                }
                j++;
            }
         i++;   
        }
     return false;   
    }
}