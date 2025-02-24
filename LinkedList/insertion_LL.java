import java.util.*;
class Node
{
    public int data;
    public Node next;
    public Node(int value,Node address)
    {
        data = value;
        next = address;
    }
    public Node(int value)
    {
        data = value;
        next = null;
    }
    public Node()
    {
        data = 0;
        next = null;
    }
    
}
class Main {
    static Node insert_head(Node head,int value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp; 
        return head;
    }
    static Node insert_tail(Node head,int value)
    {
        if (head == null) {
            return new Node(data);
        }
        Node temp = head;
        Node n = new Node(value);
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
        return head;
    }
    static Node insert_kth_position(Node head,int value ,int k)
    {  //Edge cases
        if (head == null) {
            if (k == 0) {
                return new Node(value);
            } else {
                return null;
            }
        }
        if (k == 0) {
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }
        //main case 
        int count = 0;
        Node temp = head;
        Node n = new Node(value);
        while(temp!=null){
            if(count == k-1) {
               n.next = temp.next;
               temp.next = n;
            }
            count++;
            temp = temp.next;
            
        }
        return head;
    }
    static Node insertX(Node head, int x, int a) {
        if (head == null) {
            return null;
        }
        if (head.data == x) {
            Node newNode = new Node(a);
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == x) {
                Node newNode = new Node(a);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    
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
            curr.next = temp;
            curr = curr.next;
        }
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
        head = insert_kth_position(head,x,k);
        LL_traversal(head);
    }
}

