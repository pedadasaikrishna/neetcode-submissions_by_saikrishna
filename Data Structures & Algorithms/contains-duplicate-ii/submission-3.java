class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> win = new HashSet<Integer>();
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(win.contains(nums[r])) return true;
            win.add(nums[r]);
            if(win.size()>k){
                win.remove(nums[l++]);
            }
        }
        return false;
    }
}