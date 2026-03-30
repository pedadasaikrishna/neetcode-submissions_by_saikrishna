class Solution {
    public int[] dailyTemperatures(int[] t) {
        int [] res = new int [t.length];
        Stack<Integer> st = new Stack<>();
        for(int i = t.length-1;i>=0;i--){
            while(!st.isEmpty() && t[st.peek()] <=t[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                res[i]=st.peek()-i;
            }else{
                res[i]=0;
            }
            st.add(i);
        }
        return res;
    }
}
