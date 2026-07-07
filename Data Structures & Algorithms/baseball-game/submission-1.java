class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for(String str : ops ){
            if(str.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }else if(str.equals("C")){
                st.pop();
            }else if(str.equals("D")){
                st.push(2 * st.peek());

            }else{
                st.push(Integer.parseInt(str));
            }
        }
        int tot=0;
        for(int i :st){
            tot+=i;
        }
        return tot;
    }
}