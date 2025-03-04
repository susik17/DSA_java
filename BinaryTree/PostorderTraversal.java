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

class PostorderTraversal{
    public static void postorder(Node root) {
        //Write your code here...
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }    
}
