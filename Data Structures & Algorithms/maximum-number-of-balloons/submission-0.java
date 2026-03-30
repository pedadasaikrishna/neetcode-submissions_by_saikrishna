class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> textmap = new HashMap<>();
        HashMap<Character,Integer> balloonmap = new HashMap<>();

        for(char ch : text.toCharArray()){
            textmap.put(ch,textmap.getOrDefault(ch,0)+1);
        }
        for(char ch : "balloon".toCharArray()){
            balloonmap.put(ch,balloonmap.getOrDefault(ch,0)+1);
        }
        int res =Integer.MAX_VALUE;
        for(char ch : "balloon".toCharArray()){
            res=Math.min(res,textmap.getOrDefault(ch,0)/balloonmap.get(ch));
        }
        return res;
    }
}