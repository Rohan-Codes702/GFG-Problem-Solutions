class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer>temp=new LinkedList<>();
        
       int  half=q.size()/2;
        
        for(int i=0;i<half;i++){
            temp.add(q.poll());
            
        }
        
        while(!temp.isEmpty()){
            q.add(temp.poll());
            q.add(q.poll());
        }
        
        
    }
}
