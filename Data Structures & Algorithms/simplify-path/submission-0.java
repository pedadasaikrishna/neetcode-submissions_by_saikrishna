class Solution {
    public String simplifyPath(String path) {
        String [] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(String str : arr){
            if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(!str.equals(".") && ! str.equals("")){
                st.push(str);
            }
        }
        return "/"+String.join("/",st);
    }
}