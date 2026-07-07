class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
       int r =  mat.length , c=mat[0].length;
       int l = 0 , h = r*c-1;
       while(l<=h){
        int mid = l + (h-l)/2;
        int R = mid/c;
        int C = mid%c;
        if(mat[R][C]==target) return true;
        else if(mat[R][C]<target ){
            l=mid+1;
        }else{
            h=mid-1;
        }
       }
       return false;

    }
}
