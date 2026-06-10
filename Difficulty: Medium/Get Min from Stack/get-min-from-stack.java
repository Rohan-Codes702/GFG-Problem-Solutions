class SpecialStack {
    Stack<Integer> stk;
    public SpecialStack() {
        // Define Stack
        stk=new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        stk.push(x);
    }

    public void pop() {
        // Remove the top element from the Stack
        if(!stk.isEmpty()){
            stk.pop();
        }
       
    }

    public int peek() {
        // Returns top element of the Stack
        if(!stk.isEmpty()){
            return stk.peek();
        }
        return -1;
    }

    boolean isEmpty() {
        return stk.isEmpty();
        // Check if the stack is empty
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(stk.isEmpty()){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        
      for(int i=0;i<stk.size();i++){
          min=Math.min(min,stk.get(i));
      }
       return min;
    }
}