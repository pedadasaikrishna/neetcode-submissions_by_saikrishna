class Solution {
    public int[] replaceElements(int[] arr) {
        int res [] = new int [arr.length];
        int rmax=-1;
        for(int i = arr.length-1;i>=0;i--){
            res[i]=rmax;
            rmax=Math.max(rmax,arr[i]);
        }
        return res;
    }
}