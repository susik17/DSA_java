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
    public static void inorder(Node root) {
       //Base case :
       if(root == null){
           return;
       }
       inorder(root.left);
       System.out.print(root.data+ " ");
       inorder(root.right);
    }
}
/*
ip:
1 2 3 4 5 6 7 null null null null null null 8 9
op:
4 2 5 1 6 3 8 7 9 
*/
