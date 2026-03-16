/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    int maxWidth(Node root) {
        //  code here
        if(root==null){
            return 0;
        }
        
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int maxwidth=0;
        
        while(!q.isEmpty()){
            int size=q.size();
            maxwidth=Math.max(maxwidth,size);
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        
        return maxwidth;
        
    }
}