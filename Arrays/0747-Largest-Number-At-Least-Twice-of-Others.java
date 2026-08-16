class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxNumber = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
                maxNumber = i;
            }
        }
        for(int i = 0; i<nums.length ; i++){
            if(i==maxNumber){
                continue;
            }
            if(max < 2 * nums[i]){
                return -1;
            }
        }
        return maxNumber;
    }
}
