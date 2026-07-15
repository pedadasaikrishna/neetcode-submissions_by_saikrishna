class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int num:nums){
            if(li.size()==0 || num>li.get(li.size()-1)){
                li.add(num);
            }else{
                int l=0,r=li.size()-1;
                while(l<=r){
                    int mid = l+(r-l)/2;
                    if(li.get(mid)<num){
                        l=mid+1;
                    }else{
                        r=mid-1;
                    }
                }
                li.set(l,num);
            }

        }
        return li.size();
    }
}
