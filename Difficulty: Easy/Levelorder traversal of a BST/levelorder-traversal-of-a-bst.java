class Solution {
    // Function to return the level order traversal of a BST.
    static ArrayList<Integer> levelOrder(Node node) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        
        if(node==null){
            return list;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node curr=q.poll();
            
            if(curr==null){
                continue;
            }
            
            list.add(curr.data);
            
            if(curr.left!=null){
                q.add(curr.left);
            }
           if(curr.right!=null){
                q.add(curr.right);
            }
          
        }
        return list;
    }
}