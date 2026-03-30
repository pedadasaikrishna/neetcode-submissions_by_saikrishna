class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {

            boolean destroyed = false;

            // collision possible only when stack top moving right
            // and current asteroid moving left
            while (!st.isEmpty() && st.peek() > 0 && a < 0) {

                int top = st.peek();

                // if stack asteroid smaller → it explodes
                if (Math.abs(top) < Math.abs(a)) {
                    st.pop();
                    continue;
                }

                // if equal → both explode
                else if (Math.abs(top) == Math.abs(a)) {
                    st.pop();
                    destroyed = true;
                    break;
                }

                // stack asteroid bigger → current explodes
                else {
                    destroyed = true;
                    break;
                }
            }

            // if current asteroid survived → push to stack
            if (!destroyed) {
                st.push(a);
            }
        }

        // convert stack to array
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}
