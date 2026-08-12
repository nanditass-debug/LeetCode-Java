class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int rightSum = total - leftSum - nums[i];

            answer[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return answer;
    }
}
