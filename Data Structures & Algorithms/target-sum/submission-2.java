class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return back(0,0,nums,target);
    }
    private int back(int ind , int total , int [] nums , int target){
        if(ind==nums.length){
            return total==target?1:0;
        }
        return back(ind+1,total+nums[ind],nums,target) + 
        back(ind+1,total-nums[ind],nums,target);
    }
}
