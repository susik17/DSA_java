
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

class Solution {
    //optimal
    public static Node reverseLL(Node head) {
        Node cur = head;
        Node prev= null;
        Node front;
        while(cur!=null){
            front = cur.next;
            cur.next = prev;
            //update back and front 
            prev = cur;
            cur = front;
        }
        return prev;
    }
    /*
    //Brute force 
    public static Node reverseLL(Node head) {
        Node temp = head;
        Stack<Integer> s = new Stack<>();
        while(temp!=null){
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            temp.data = s.pop();
            temp = temp.next;
        }
        return head;
    }
    */
}
/*
ip:
4
0 1 2 3
op:
3 2 1 0
*/
