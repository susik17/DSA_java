
import java.util.*;
class Node
{
    public int data;
    public Node next;
    public Node prev;
    public Node(int value,Node next_address,Node prev_address)
    {
        data = value;
        next = next_address;
        prev = prev_address;
    }
    public Node(int value)
    {
        data = value;
        next = null;
        prev = null;
    }
    public Node()
    {
        data = 0;
        next = null;
        prev = null;
    }
    
}
class Main {
    static void LL_traversal(Node head){
         Node temp = head;
         while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
             
         }
         
     }
    static Node array_to_LL(int[] arr,int n)
    {
        if(n==0) return null;
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i=1;i<=n-1;i++){
            Node temp = new Node(arr[i]);
            temp.prev = curr;
            curr.next = temp;
            curr = temp;
        }
        return head;
    }
    static Node insert_head(Node head,int x){
        /*
        Node n = new Node(x);
        n.next = head;
        head = n;
        return head;
        */
        if (head == null) {
            return new Node(x);
        }
        Node n = new Node(x,head,null);
        head.prev = n;
        return n;
      
    }
    static Node insert_tail(Node head,int x){
        if(head == null){
             return new Node(x);}
        Node temp = head;
        Node n = new Node(x);
        while(temp.next!=null){
            temp = temp.next; }
        temp.next =  n;
        n.prev = temp;
        return head;
     
    }
    static Node insert_kth_position(Node head,int x,int k){
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(count == k){
                break;
            }
            count++;
            temp = temp.next;
        }
        if(k == 0){
            return insert_head(head, x);
        }
        Node back = temp.prev;
        Node n = new Node(x, temp, back);
        back.next = n;
        temp.prev = n;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        
        Node head = array_to_LL(arr,n);
        head =  insert_kth_position(head,x,k);
        LL_traversal(head);
    }
}
