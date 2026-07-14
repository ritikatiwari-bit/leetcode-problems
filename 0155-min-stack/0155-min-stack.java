class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> mst = new Stack<>();

    public MinStack() {
       
    }
    
    public void push(int value) {
        stack.push(value);
        if(mst.empty() || mst.peek()>=value)
            mst.push(value);
    }
    
    public void pop() {
        int curr=stack.peek();
        stack.pop();
        if(curr == mst.peek()){
            mst.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */