
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.add(val);
        min = Math.min(min, val);
    }
    
    public void pop() {
        if (st.isEmpty()) return;

        int removed = st.pop();   // always remove top

        if (removed == min) {
            min = Integer.MAX_VALUE;

            for (int i : st) {    // recompute min
                min = Math.min(min, i);
            }
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}