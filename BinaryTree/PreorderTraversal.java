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
    public static void preorder(Node root) {
        //Code Here
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
/*
ip:
1 2 3 null 4 null null
op:
1 2 4 3
*/
