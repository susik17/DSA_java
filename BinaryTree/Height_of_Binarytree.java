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
    public static int heightOfBinaryTree(Node root){
      //Write your code here...
      if(root == null) return 0;
      int left_subtree_height = heightOfBinaryTree(root.left);
      int right_subtree_height = heightOfBinaryTree(root.right);
      return 1+Math.max(left_subtree_height,right_subtree_height );
    }
   
}
