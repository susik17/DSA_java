import java.util.*;
/*
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
*/

class Solution{
    public static Node search(Node root, int target){
        
        while(root != null){
        if(target == root.data){
            return root;
        }
        else if(target < root.data){
            root = root.left;
        }
        else if (target > root.data){
            root = root.right;
        }
        }
        return null;
            
        }
        
        
    }
