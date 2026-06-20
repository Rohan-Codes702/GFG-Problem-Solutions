class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer>q=new LinkedList<>();
        
        for(int i=0;i<arr.size();i++){
            q.offer(arr.get(i));
        }
        return  q;
    }
}