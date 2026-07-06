class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int tar=1;
        for(int num:nums){
            if(num>0 && tar==num){
                tar++;
            }
        }
        return tar;
    }
}