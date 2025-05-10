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
//optimal - Hare and Tortoise algorithm
class Solution {
    public static Node middleOfTheLL(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

/*
//Brute force
public class Solution {
    public static Node middleOfTheLL(Node head) {
        Node temp = head;
        int n = 0,count = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        temp = head;
        int mid = n/2;
        while(temp!=null){
            if(count == mid){break;}
            count++;
            temp = temp.next;
            
        }
        return temp;
    }
}*/