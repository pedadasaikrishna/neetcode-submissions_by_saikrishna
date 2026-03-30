class Solution {

    private boolean can(int[] wt, int days, int cap){

        int usedDays = 1;
        int load = 0;

        for(int w : wt){

            // if capacity exceeded, start new day
            if(load + w > cap){
                usedDays++;
                load = 0;
            }

            load += w;
        }

        return usedDays <= days;
    }

    public int shipWithinDays(int[] wt, int days) {

        int l = 0;
        int r = 0;

        // determine binary search bounds
        for(int w : wt){
            l = Math.max(l, w); // minimum capacity
            r += w;             // maximum capacity
        }

        int res = r;

        while(l <= r){

            int mid = l + (r - l) / 2;

            if(can(wt, days, mid)){
                res = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return res;
    }
}