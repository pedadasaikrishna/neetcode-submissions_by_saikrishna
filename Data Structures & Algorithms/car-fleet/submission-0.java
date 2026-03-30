class Solution {
    public int carFleet(int t, int[] pos, int[] sp) {
        
        int n = pos.length;
        int[][] pair = new int[n][2];

        for(int i = 0; i < n; i++){
            pair[i][0] = pos[i];
            pair[i][1] = sp[i];
        }

        // sort by position
        Arrays.sort(pair, (a,b) -> Integer.compare(a[0], b[0]));

        int cnt = 0;
        double lasttime = 0;

        for(int i = n-1; i >= 0; i--){
            double T = (double)(t - pair[i][0]) / pair[i][1];

            if(T > lasttime){
                cnt++;
                lasttime = T;
            }
        }

        return cnt;
    }
}