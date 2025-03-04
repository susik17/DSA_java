import java.util.*;

/*
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/

public class Solution {
    public static Node evenAndOdd(Node head) {
        //Write your code here...
        Node cur = head;
        Node prev = null;
        Vector<Integer> v = new Vector<>();
        int count = 0;
        while (cur != null) {
            if (count % 2 == 0) {
                v.add(cur.data);
                if (prev != null) {
                    prev.next = cur.next; // Skip the even-indexed nodes
                }
            } else {
                prev = cur; // Only update prev for odd-indexed nodes
            }
            cur = cur.next;
            count++;
        }
        cur = head;
        while (cur != null && cur.next != null) {
            cur = cur.next;
        }
        for (int i = 0; i < v.size(); i++) {
            Node n = new Node(v.get(i));
            cur.next = n;
            cur = cur.next;
        }

        return head;
    
    }
    
}