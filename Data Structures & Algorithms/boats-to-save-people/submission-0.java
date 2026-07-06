class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int cnt=0;
        Arrays.sort(people);
        int l=0,r=people.length-1;
        while(l<=r){
            if(people[l]+people[r]<= limit){
                l++;
            }
            r--;
            cnt++;

        }
        return cnt;
    }
}

// limit ==> 3

// 1,2,2,3,3