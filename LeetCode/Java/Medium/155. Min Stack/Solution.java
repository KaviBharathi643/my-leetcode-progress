class MinStack {

    Stack<Integer> stack;
    Stack<Integer> ms;

    public MinStack() {
        stack = new Stack<>();
        ms = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(ms.empty()){
            ms.push(value);
        }
        else{
            ms.push(Math.min(value,ms.peek()));
        }
    }
    
    public void pop() {
            ms.pop();
        
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        return ms.peek();
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