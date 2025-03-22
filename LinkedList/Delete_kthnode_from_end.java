
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
    public static Node DeleteKthNodeFromEnd(Node head, int k) {
        Node front = head,back = head;
        for(int i=1;i<=k+1;i++){
            front = front.next;
        }
        if(front==null){
            return head.next;
        }
        while(front.next!=null){
            front = front.next;
            back = back.next;
        }
        back.next = back.next.next;
        return head;
    }
    /*
    //brute force 
    public static Node DeleteKthNodeFromEnd(Node head, int k) {
        Node temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        int n = length;
        int k1 = n-1-k;
        //delete head
        if(k1==0){
            return head.next;
        }
        temp = head;
        int count = 0;
        while(temp!=null){
            if(count == k1-1){
                temp.next = temp.next.next;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
    */
    
}
/*
ip:
5 1
8 4 5 7 2
op:
8 4 5 2 
*/
