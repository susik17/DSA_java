/*
class Node {
    public int data;
    public Node next;

    public Node() {}
    public Node(int data) { this.data = data; this.next = null;}
    public Node(int data, Node next) { this.data = data; this.next = next; }
}
*/
//Brute force
/*
class Solution {
    public static Node deleteKthFromMiddle(Node head, int k) {
        Node temp = head;
        int n = 0,count = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        temp = head;
        int mid = (n/2);
        for(int i = 0;i< mid -k-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; 
        return head;
    }
}
*/

//optimal 
class Solution {
    public static Node deleteKthFromMiddle(Node head, int k) {
        Node fast = head;
        Node slow = head;
        int mid_position = 0;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            mid_position++;
        }
        int target_position = mid_position - k - 1;
        Node temp = head;
        for(int i =0;i < target_position;i++){
            temp = temp.next;
        }
       temp.next = temp.next.next;
       return head;
    }
}
