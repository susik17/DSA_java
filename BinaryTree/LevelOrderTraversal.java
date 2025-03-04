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
    public ArrayList<Integer> levelorder(Node root) {
      //Write your code here...
      ArrayList<Integer> ans = new  ArrayList<Integer>();
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      while(!q.isEmpty()){
          int length = q.size();
          for(int i=0;i<length;i++){
               Node temp = q.remove();
               //add children of removed node
               if(temp.left!=null){ q.add(temp.left);}
               if(temp.right!=null){ q.add(temp.right);}
               ans.add(temp.data);
          }
      }
      return ans;
    }
}
/*
ip:
1 2 3 4 5 6 7 null null null null null null 8 9
op:
1 2 3 4 5 6 7 8 9
*/
