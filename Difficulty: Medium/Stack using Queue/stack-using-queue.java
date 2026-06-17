class myStack {
    Queue<Integer> q = new LinkedList<>();
    Stack <Integer>stk=new Stack<>();

    void push(int x) {
        // Inserts an element x at the top of the stack
        q.offer(x);
        
        int size=q.size();
        
        while(size>1){
           q.offer(q.poll());
           size--;
        }
    }

    void pop() {
        // Removes an element from the top of the stack
        if(!q.isEmpty()){
            q.poll();
        }
        
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }

    int size() {
        // Returns the current size of the stack
        return q.size();
    }
}
