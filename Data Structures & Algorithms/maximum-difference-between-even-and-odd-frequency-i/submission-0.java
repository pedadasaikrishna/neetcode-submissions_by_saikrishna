class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch :s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int ho=0,le=Integer.MAX_VALUE;

        for(int f : freq.values()){
            if(f%2==0){
                le=Math.min(f,le);
            }else{
                ho=Math.max(ho,f);
            }
        }
        return ho-le;
    }
}