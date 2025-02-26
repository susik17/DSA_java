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
    static Node delete_head(Node head){
        //Edge case
        if(head == null){return null;}
        Node temp = head;
        head = head.next;
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
        LL_traversal(head);
    }
}

