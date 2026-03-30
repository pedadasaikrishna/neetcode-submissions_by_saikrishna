class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0], csum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                csum += nums[i];
            } else {
                csum = nums[i];
            }

            max = Math.max(max, csum);
        }

        return max;
    }
}
