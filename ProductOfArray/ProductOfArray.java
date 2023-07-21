class ProductOfArray{
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5}; //[3,4,5,1,2]
        int k = 3;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if (i >= nums.length - k ) {
                result[i] = nums[(k+i)%nums.length];
            } else {
                result[i] = nums[i+k];
            } 
        }

        
        for (int i = 0; i < result.length; i++){
        System.out.println(result[i]);
        }
        
    }
    public int[] productExceptSelf(int[] nums) {

        int product = 1;
        int[] answer = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            answer[i] = product;
        }

        product = 1;
        for (int i = nums.length-1 ; i < nums.length; i++) {
            product = product;
        }
        return answer;


    }






}