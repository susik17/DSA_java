import java.util.*;

/*class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    //optimal => O(n) => single traversal of tree  - within that update height and diameter
    //make  diameter as class variable => access same by methods 
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
        
    }
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left_H = height(root.left);
        int right_H = height(root.right);
        // update diameter
        diameter =  Math.max(diameter,left_H + right_H);

        return 1 + Math.max(left_H,right_H);
    }
}
     //Brute force - O(n^2) => problem repeated calculation of height of subtrees
     /*
    public static int heightOfBinaryTree(Node root){
      //Write your code here...
      if(root == null) return 0;
      int left_subtree_height = heightOfBinaryTree(root.left);
      int right_subtree_height = heightOfBinaryTree(root.right);
      return 1+Math.max(left_subtree_height,right_subtree_height );
    }
    int ans = -1;
    public int diameterOfBinaryTree(Node root) {
        //Write your code here...
        if(root == null) {return 0;}
        int Left = heightOfBinaryTree(root.left);
        int right = heightOfBinaryTree(root.right);
        ans = Math.max(ans, Left+right);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return ans;
    }
    */
}
/*
ip:
1 2 3 4 5 null null null null 6 null
op: 
4
*/
