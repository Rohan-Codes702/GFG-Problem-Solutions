class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
       Stack<Integer>stk=new Stack<>();
       
       
        if (k > q.size()) {
            return q;
        }
       
       for(int i=0;i<k;i++){
           stk.push(q.poll());
           
       }
       
       while(!stk.isEmpty()){
           q.add(stk.pop());
       }
       
       int  rem=q.size()-k;
       
       for(int i=0;i<rem;i++){
           q.add(q.poll());
       }
       return q ;
       
        
        
        
        
    }
}