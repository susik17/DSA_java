import java.util.*;

/*
class Node {
    public
        int data;
        Node next;
        Node prev;
        Node (int value, Node nextAddress, Node prevAddress) {
            data = value;
            next = nextAddress;
            prev = prevAddress;
        }
        Node(int value){
            data = value;
            next = null;
            prev = null;
        }
}
*/
class Reverse_DLL {
    public static Node reverseDLL(Node head) {
        //optimal
        //edgecase
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node back = null;
        while(curr!=null){
            back = curr.prev;
            curr.prev = curr.next;
            curr.next = back;
            curr = curr.prev;
        }
        return back.prev;
        /*
        //Better
        Node temp = head;
        java.util.Stack<Integer> s = new java.util.Stack<>();
        while(temp!=null)
        {
            s.push(temp.data);
            temp = temp.next;
            
        }
        temp = head;
        while(temp!=null)
        {
            temp.data = s.pop();
            temp = temp.next;
        }
       return head; 
       */
    }
    
    
}
