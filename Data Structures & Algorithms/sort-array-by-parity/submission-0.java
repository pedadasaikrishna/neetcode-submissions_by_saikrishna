class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] res = new int [nums.length];
        int e=0,o=nums.length-1;
        for(int i:nums){
            if(i%2==0){
                res[e++]=i;
            }else{
                res[o--]=i;
            }
        }
        return res;
    }
}