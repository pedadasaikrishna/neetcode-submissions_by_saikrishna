class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i : nums){
            int ind = Math.abs(i)-1;
            nums[ind] = -Math.abs(nums[ind]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                res.add(i+1);
            }
        }

        return res;
    }
}