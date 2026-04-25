class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        Stack <Integer>stk=new Stack<>();
        
        for(int i=0;i<n;i++){
            int curr=arr[i];
            
            while(!stk.isEmpty() && (stk.peek() * curr < 0)){
                
                if(Math.abs(curr)>Math.abs(stk.peek())){
                   stk.pop();
                   continue;
                }
                else if(Math.abs(curr)<Math.abs(stk.peek())){
                    curr=0;
                    break;
                }
                else{
                   stk.pop();
                   curr=0;
                   break;
                }
                
            }
            
            if(curr!=0){
                stk.push(curr);
            }
        }
        
        list.addAll(stk);
        return list;
    }
}