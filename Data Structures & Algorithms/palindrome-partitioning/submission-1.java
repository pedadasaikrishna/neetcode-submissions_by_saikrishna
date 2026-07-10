class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        dfs(s,0,sub,res);
        return res;
    }
    public void dfs(String s , int ind , List<String> sub,List<List<String>> res){
        if(ind>=s.length()){
            res.add(new ArrayList<>(sub));
            return ;
        }

        for(int j =ind;j<s.length();j++){
            if(isPalin(s,ind,j)){
                sub.add(s.substring(ind,j+1));
                dfs(s,j+1,sub,res);
                sub.remove(sub.size()-1);
            }
        }
    }
    public boolean isPalin(String str , int l,int r){
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
