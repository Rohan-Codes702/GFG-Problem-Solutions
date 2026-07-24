/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
}*/
class Solution {
     int ans=0;
    public int longestConsecutive(Node root) {
        
        if(root==null){
            return -1;
        }
        // code here
        helper(root,1);
        if(ans==1){
            return -1;
        }
        return ans;
       
        
    }
    public  void  helper(Node root,int count){
        if(root==null){
            return ;
        }
        ans=Math.max(count,ans);
        
       if(root.left!=null){
           if(root.left.data==root.data+1){
               helper(root.left,count+1);
           }
           else{
               helper(root.left,1);
           }
       }
       if(root.right!=null){
           if(root.right.data==root.data+1){
               helper(root.right,count+1);
           }
           else{
               helper(root.right,1);
           }
       }
        
    }
}