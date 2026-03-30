class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int target = threshold * k;
        int csum = 0, cnt = 0;

        for (int i = 0; i < k; i++) {
            csum += arr[i];
        }

        if (csum >= target) cnt++;

        for (int i = k; i < arr.length; i++) {
            csum += arr[i] - arr[i - k];
            if (csum >= target) cnt++;
        }

        return cnt;
    }
}