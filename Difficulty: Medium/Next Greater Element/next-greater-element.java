class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        
        Stack<Integer>stk=new Stack();
        int n=arr.length;
        
        
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty()&& stk.peek()<=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(stk.peek());
            }
           
            stk.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
        
    }
}