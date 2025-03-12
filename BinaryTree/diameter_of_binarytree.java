import java.util.*;

/*class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}*/
 class Solution{
     //optimal - O(n)
      
     public  int heightOfBinaryTree(Node root,int[] ans){
      //Write your code here...
      if(root == null) return 0;
      int left = heightOfBinaryTree(root.left,ans);
      int right = heightOfBinaryTree(root.right ,ans);
      ans[0] = Math.max(ans[0], left+right);
      return 1+Math.max(left,right);
    }
    
    public int diameterOfBinaryTree(Node root) {
        //Write your code here...
        int[] ans = new int[1];
        ans[0] = 0;
        if(root == null) {return 0;}
        heightOfBinaryTree(root,ans);
        return ans[0];
    }
     
     //Brute force - O(n^2)
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
