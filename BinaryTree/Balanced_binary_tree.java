import java.util.*;
/*
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
 class Solution{
    static int height( Node root , boolean ans){
        if(root == null ) return 0;
        int left = height(root.left,ans);
        int right = height(root.right,ans);
        int diff = Math.abs(left-right);
        if (diff > 1) ans=false;
        return 1+Math.max(left,right);
        
    }
    public boolean balanced(Node node) {
        //Write your code here...
        boolean ans = true;
        height(node,ans);
        return ans;
        
    }
    
}