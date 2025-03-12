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
    public static boolean isSameTree(Node root1, Node root2){
        //Write your code here...
        //Base cases
        if(root1==null && root2==null){  return true;}
        if(root1!=null && root2==null){ return false;}
        if(root1==null && root2!=null){ return false;}
        //main case
        if(root1.data != root2.data){
            return false;
        }
        boolean a = isSameTree(root1.left , root2.left);
        boolean b = isSameTree(root1.right , root2.right);
        return a&&b;
        
        
    }
}