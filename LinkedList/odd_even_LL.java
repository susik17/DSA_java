
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
    public static Node evenAndOdd(Node head){
        Node odd,even,odd_head;
        even = head;
        odd_head = head.next;
        odd = head.next;
        while(odd!=null && odd.next!=null){
            even.next = even.next.next;
            odd.next = odd.next.next;
            even = even.next;
            odd = odd.next;
            
        }
        even.next = odd_head;
        return head;
    }
    /*
    bruteforce 
    public static Node evenAndOdd(Node head) {
        Node temp;
        temp = head;
        List<Integer> v = new ArrayList<>();
        //Even Indexes
        while(temp!=null && temp.next!=null){
            v.add(temp.data);
            temp = temp.next.next;
        }
        if(temp!=null){
            v.add(temp.data);
        }
        //odd Indexes
        temp = head.next;
        while(temp!=null && temp.next!=null){
            v.add(temp.data);
            temp = temp.next.next;
        }
        if(temp!=null){
            v.add(temp.data);
        }
        //updation on LL
        temp = head;
        for (int i = 0; i < v.size(); i++) {
            temp.data = v.get(i);
            temp = temp.next;
        }
        return head;
    }
    */
    
}
/*
ip:
6
5 8 7 2 9 3
op:
5 7 9 8 2 3 
*/