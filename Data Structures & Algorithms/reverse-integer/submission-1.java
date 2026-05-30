class Solution {
    public int reverse(int x) {

        boolean neg = x < 0;

        String str = String.valueOf(Math.abs((long)x));
        String rev = new StringBuilder(str).reverse().toString();

        long num = Long.parseLong(rev);

        if (neg) num = -num;

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
            return 0;

        return (int) num;
    }
}