class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
    public void merge(int [] arr , int l , int r ){
        if(l>=r) return ;
        int mid = l + (r-l)/2;
        merge(arr,l,mid);
        merge(arr,mid+1,r);
        sort(arr,l,mid,r);
    }
    public void sort(int [] arr , int l , int mid , int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l , j = mid+1;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=r){
            temp.add(arr[j]);
            j++;
        }
        for(i=l;i<=r;i++){
            arr[i]=temp.get(i-l);
        }
    }
}