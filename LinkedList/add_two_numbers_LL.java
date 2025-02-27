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

class add_two_numbers_LL {
    public static Node addTwoNumbers(Node head1, Node head2) {
        //Write your code here...
        Node temp1 = head1;
        Node temp2 = head2;
        int last_digit;
        int carry = 0;
        Node ans = new Node(-1);
        Node cur = ans;
        int sum;
        while(temp1 != null || temp2!=null){
            sum = carry;
            if(temp1!=null) sum += temp1.data;
            if(temp2!=null) sum += temp2.data;
            last_digit = sum%10;
            cur.next = new Node(last_digit);
            carry = sum/10;
            if(temp1!=null) temp1 = temp1.next;
            if(temp2!=null) temp2 = temp2.next;
            cur = cur.next;
        }
        if(carry!= 0){
            cur.next = new Node(1);
        }
        return ans.next;
    }
}
