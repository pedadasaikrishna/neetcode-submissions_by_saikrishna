class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        fun(new StringBuilder(),res,0,0,n);
        return res;
    }
    public  void fun(StringBuilder curr,List<String> res,int open,int end,int n){
        if(curr.length()==2*n){
            res.add(new String(curr.toString()));
            return ;
        }

        if(open<n){
            curr.append("(");
            fun(curr,res,open+1,end,n);
            curr.deleteCharAt(curr.length()-1);
        }
        if(end<open){
            curr.append(")");
            fun(curr,res,open,end+1,n);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
