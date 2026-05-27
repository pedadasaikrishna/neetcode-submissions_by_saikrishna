class FreqStack {
    HashMap<Integer,Integer> map;
    Stack<Integer>st;
    public FreqStack() {
        map= new HashMap<>();
        st = new Stack();
    }
    
    public void push(int val) {
        st.add(val);
        map.put(val,map.getOrDefault(val,0)+1);
    }
    
    public int pop() {
        int maxCnt = Collections.max(map.values());
        int ind = st.size()-1;
        while(ind>=0 && map.get(st.get(ind))!=maxCnt){
            ind--;
        }
        int val = st.remove(ind);
        map.put(val,map.get(val)-1);
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */