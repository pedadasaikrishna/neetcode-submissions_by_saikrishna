class MyQueue {
    Stack<Integer> st ;
    public MyQueue() {
        st= new Stack<>();
    }
    
    public void push(int x) {
        st.add(x);
    }
    
    public int pop() {
        if(!st.isEmpty()){
        int val = st.get(0);

        st.remove(val);
        return val;
        }
        return -1;
    }
    
    public int peek() {
        return st.get(0);
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */