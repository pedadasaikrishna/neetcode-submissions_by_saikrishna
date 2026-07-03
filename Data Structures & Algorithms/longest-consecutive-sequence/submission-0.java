class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int res =0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int  len =1; 
                while(set.contains(num+len)){
                    len++;
                }
                res=Math.max(res,len);
            }

        }
        return res;
    }
}
