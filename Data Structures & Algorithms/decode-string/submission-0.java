class Solution {
    public String decodeString(String s) {

        Stack<Integer> numSt = new Stack<>();
        Stack<String> strSt = new Stack<>();

        String cur = "";
        int k = 0;

        for (char ch : s.toCharArray()) {

            // Build number (handles multi-digit numbers too)
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }

            // Opening bracket
            else if (ch == '[') {
                numSt.push(k);
                strSt.push(cur);

                // Reset for inner substring
                k = 0;
                cur = "";
            }

            // Closing bracket -> decode current block
            else if (ch == ']') {

                int times = numSt.pop();
                String prevStr = strSt.pop();

                StringBuilder temp = new StringBuilder();

                // Repeat current string
                for (int i = 0; i < times; i++) {
                    temp.append(cur);
                }

                // Combine previous + repeated current
                cur = prevStr + temp.toString();
            }

            // Normal character
            else {
                cur += ch;
            }
        }

        return cur;
    }
}