class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int prefix =1 , suffix=1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            prefix = nums[i] * (prefix==0? 1 : prefix);
            suffix = nums[n-i-1] * (suffix==0? 1 : suffix);
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}
