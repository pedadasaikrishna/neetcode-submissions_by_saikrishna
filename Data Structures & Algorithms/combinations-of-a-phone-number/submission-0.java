
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        dfs(digits,0,new StringBuilder(),res,map);
        return res;
    }
    public void dfs(String digits,int ind ,StringBuilder curr,List<String> res,HashMap<Character,String> map){
        if(ind==digits.length()){
            res.add(new String(curr.toString()));
            return;
        }
        char [] arr = map.get(digits.charAt(ind)).toCharArray();
        for(char ch:arr){
            curr.append(ch);
            dfs(digits,ind+1,curr,res,map);
            curr.deleteCharAt(curr.length()-1);
        }

    }
}
