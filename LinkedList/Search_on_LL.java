import java.util.Scanner;
class Node{
    public int data;
    public Node next;
    //constructor 2-arguments
    public Node(int value,Node address){
        data = value;
        next = address;
    }
    //single argument
    public Node(int value){
        data = value;
        next = null;
    }
    //no argument
    public Node(){
        data = 0;
        next = null;
    }
}
class Main{
    static Node array_to_LL(int[] arr,int n){
        if (arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node cur = head;
        for(int i=1;i<=n-1;i++){
            Node temp = new Node(arr[i]);
            cur.next = temp;
            cur = cur.next;
        }
        return head;
     }
     static boolean Search_LL(Node head,int x){
         Node temp = head;
         while(temp!=null){
             if(temp.data == x){
                 return true;
             }
             temp = temp.next;
        }
        return false;
     }
     
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        Node head = array_to_LL(arr,n);
        int x = sc.nextInt();
        System.out.println(Search_LL(head,x));
    
        
        
    }
}
/*
ip:
4
24 2 3 4
100
op:
false
*/

