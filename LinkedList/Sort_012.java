
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
    //optimal 
     public static Node SortLL(Node head){
        Node temp = head;
        Node prev_0 = null,prev_1 = null,prev_2 = null;
        Node first_0 = null,first_1 = null,first_2 = null;
        //make connections among 0,1,2 seperately
        while(temp!=null){
            if(temp.data == 0){
                if(prev_0 == null){
                    first_0 = temp;
                   }
                else{
                    prev_0.next = temp;
                  }
                prev_0 = temp;
            }
            else if(temp.data == 1){
                if(prev_1 == null){
                    first_1 = temp;
                }
                else{
                    prev_1.next = temp;
                }
                prev_1 = temp;
            }
            else if(temp.data == 2){
                if(prev_2 == null){
                    first_2 = temp;
                }
                else{
                    prev_2.next = temp;
                }
                prev_2 = temp;
            }
        temp = temp.next;
        }
        //make connections combines all
        //prev_0.next = first_1;
        //prev_1.next = first_2;
        //prev_2.next = null;
        //return first_0;
        //with handling edge cases 
        if(prev_0!=null){
            if(first_1!=null){ prev_0.next = first_1;  }
            else{  prev_0.next = first_2;}
        }
        if(prev_1!=null){  prev_1.next = first_2;}
        if(prev_2!=null){  prev_2.next = null;}
           
        if(first_0!=null){ return first_0; }
        if(first_1!=null){ return first_1;}
        return first_2;
        
     }
    /*
    Brute force 
    public static Node SortLL(Node head) {
       int count_0=0,count_1=0,count_2=0;
       Node temp = head;
       //count no's 
       while(temp!=null){
           if(temp.data == 0){
               count_0++;
           }
           else if(temp.data == 1){
               count_1++;
           }
           else if(temp.data == 2){
               count_2++;
           }
           temp = temp.next;
       }
       //update LL based on count 
       temp = head;
       while(temp!=null){
           if(count_0!=0){
               temp.data = 0;
               count_0--;
           }
           else if(count_1!=0){
               temp.data = 1;
               count_1--;
           }
           else if(count_2!=0){
               temp.data = 2;
               count_2--;
           }
           temp = temp.next;
       }
    return head;
    }
    */
    
}
/*
ip:
7
1 2 0 0 2 1 0
op:
0 0 0 1 1 2 2 
*/