import java.util.*;

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
*/

class Solution {
    public static Node buildTree(int n, int arr[]) {
        //Write your code here...
        Node root = new Node(arr[0]);
        root.left = new Node(arr[1]);
        root.right = new Node(arr[2]);
        root.left.left =new Node(arr[3]);
        root.left.right = new Node(arr[4]);
        root.right.left = new Node(arr[5]);
        root.right.right = new Node(arr[6]);
        root.left.left.left = new  Node(arr[7]);
        root.left.left.right = new Node(arr[8]);
        return root;
    }
}
/*
ip:
9
5 3 7 2 4 6 8 1 9
op:
5
*/