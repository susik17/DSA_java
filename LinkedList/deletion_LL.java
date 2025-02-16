import java.util.Scanner;
class Node{
    public int data;
    public Node next;
    public Node(int value , Node address){
        data = value;
        next = address;
    }
    public Node(int value){
        data = value;
        next = null;
    }
    public Node(){
        data = 0;
        next = null;
    }
}
class Main {
    static Node array_to_LL(int[] arr,int n){
        //edge case
        if(arr.length == 0){ return null;}
        Node head = new Node(arr[0]);
        Node cur = head;
        for(int i=1;i<=n-1;i++){
            Node temp = new Node(arr[i]);
            cur.next = temp;
            cur = temp;
        }
        return head;
    }
    static void print_LL(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    static Node delete_head(Node head){
        //Edge case
        if(head == null){return null;}
        Node temp = head;
        head = head.next;
        return head;
      
    }
    static Node delete_tail(Node head){
        if(head==null || head.next ==null){
            return null;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static Node delete_kth_element(Node head,int k){
        if(head==null){ return head;}
         if (k == 0) {
            Node temp = head;
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        while(temp.next!=null){
            if(count == k-1){
                Node n =temp.next;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count++;
            }
        return head;
    }
    static Node delete_value_x(Node head,int x){
        //Edge cases
        if(head == null){return head;}
        if(x == head.data){
            Node temp = head;
            head =head.next;
            return head;
        }
        Node temp = head;
        while(temp.next!=null){
        if(x == temp.next.data){
                Node n =temp.next;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        Node head = array_to_LL(arr,n);
        int k = sc.nextInt();
        int x = sc.nextInt();
        head = delete_value_x(head,x);
        print_LL(head);
        
    }
}