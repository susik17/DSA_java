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
    public static void main(String[] args) {
        Node n2 = new Node(5,null);
        Node n1 = new Node(6);
        Node n = new Node();
       
        System.out.println(n2.data+" "+n2.next);
        System.out.println(n1.data+" "+n1.next);
        System.out.println(n.data+" "+n.next);
        
    }
}
/*
op:
5 null
6 null
0 null
*/