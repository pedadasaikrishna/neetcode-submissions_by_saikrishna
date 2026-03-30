class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2=nums2.length;
        int [] nge2 = new int[n2];
        Stack<Integer> st = new Stack<>();

        for(int i=n2-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }

            if(st.size()==0){
                nge2[i]=-1;
            }else{
                nge2[i]=st.peek();
            }
            st.push(nums2[i]);

        }
        // System.out.println(Arrays.toString(nge2));
        
        int res [] = new int [nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=nge2[get(nums1[i],nums2)];
        }
        return res;
    }
    private int get(int val, int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
}