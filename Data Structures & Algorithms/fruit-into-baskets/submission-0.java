class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l =0,r=0;
        int maxlen =0 ;
        while(r<f.length){
            map.put(f[r],map.getOrDefault(f[r],0)+1);
            if(map.size()>2){
                map.put(f[l],map.get(f[l])-1);
                if(map.get(f[l])==0){
                    map.remove(f[l]);
                }
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}