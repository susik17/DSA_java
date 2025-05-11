
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
//optimal - Hare and Tortoise algorithm 
/*
class Solution {
    public static Node deleteMiddle(Node head) {
        if(head.next == null){return null;}
        Node prev = null;
        Node slow = head;
        Node fast  = head;
        while(fast!=null && fast.next!=null){
            prev =  slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next =  prev.next.next;
        return head;
    }
}
*/
//brute force  
class Solution {
    public static Node deleteMiddle(Node head) {
        int n=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        int mid_prev = (n/2)-1;
        temp =  head;
        int count = 0;
        while(temp!=null){
            if(count==mid_prev){
                temp.next = temp.next.next;
            }
            temp =temp.next;
            count++;
        }
        return head;
    }
}
