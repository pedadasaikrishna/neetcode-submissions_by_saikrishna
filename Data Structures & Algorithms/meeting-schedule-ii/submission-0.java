/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int [] arivals = new int[n];
        int [] dep = new int[n];
        for(int i=0;i<n;i++ ){
            arivals[i]=intervals.get(i).start;
            dep[i]=intervals.get(i).end;
        }
        Arrays.sort(arivals);
        Arrays.sort(dep);

        int cnt =0 ,res=0,s=0,e=0;
        while(s<n){
            if(arivals[s]<dep[e]){
                cnt++;
                s++;
            }else{
                cnt--;
                e++;
            }
            res=Math.max(res,cnt);
        }
        return res;
    }
}
