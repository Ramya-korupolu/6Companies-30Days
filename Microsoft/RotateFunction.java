class Solution {
    public int maxRotateFunction(int[] nums) {
        int length = nums.length;
        if(length == 1){
            return 0;
        }    

        int value = 0, num_sum = 0;
        
        for(int i = 0; i < length; i++) {
            value += (i * nums[i]);
            num_sum += nums[i];
        }
            

        int rotate_value = value;
        for(int i = length - 1; i >= 0; i--) {
            rotate_value += num_sum;
            rotate_value -= (length * nums[i]);
            value = Math.max(value, rotate_value);
        }
        return value;
    }
}

