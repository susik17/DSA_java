import java.util.*;
/*
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution{
    public static int ShortestPath(Node root) {
        //Base Cases 
        if(root == null) return 0;
        //leaf Nodes 
        if(root.left == null && root.right == null){
            return 1;
        }
        // single chile Nodes
        if(root.left == null){
            return 1+ShortestPath(root.right);
        }
         if(root.right == null){
            return 1+ShortestPath(root.left);
        }
      int left_subtree_height =ShortestPath(root.left);
      int right_subtree_height = ShortestPath(root.right);
      return 1 + Math.min(left_subtree_height,right_subtree_height);
        
    }
    }
    /*
    ip: 1 2 3 null 4 null 5
    op: 3
    */
      
