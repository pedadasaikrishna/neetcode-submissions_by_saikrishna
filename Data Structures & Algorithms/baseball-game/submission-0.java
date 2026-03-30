class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();

        for (String str : op) {
            if (str.equals("+")) {
                int b = st.pop();
                int a = st.pop();

                st.push(a);      
                st.push(b);      
                st.push(a + b);  

            } 
            else if (str.equals("D")) {
                st.push(2 * st.peek());
            } 
            else if (str.equals("C")) {
                st.pop();
            } 
            else {
                st.push(Integer.parseInt(str));
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}
