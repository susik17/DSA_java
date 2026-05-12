import java.util.*;
class Main {
    //Brute Force 
    static  void nextGreaterElement(int[] arr){
        int n = arr.length;
        ArrayList<Integer> nge = new ArrayList<>();
        for(int i = 0 ; i < n ;i++){
            int nextgreater = -1;
            for(int j = i+1 ;j < n ; j++){
                if(arr[j] > arr[i]){
                    nextgreater = arr[j];
                    break;
                }
            }
            nge.add(nextgreater);
         }
        //print elements 
        for(int val : nge){
            System.out.print(val +" ");
        }
    }
    
    /*
   // optimal - Using Stack 
   static  void nextGreaterElement(int[] arr){
        int n = arr.length;
        Stack<Integer> st =  new Stack<>();
        ArrayList<Integer> nge = new ArrayList<>();
        for(int i = n-1; i>=0; i--){
            //remove smaller elements 
            while(!st.empty() && st.peek()<= arr[i]){
                st.pop();
            }
            nge.add(st.empty() ? -1 : st.peek());
            st.push(arr[i]);
        }
        Collections.reverse(nge);  //to return correct order 
        //return nge;
        
        for(int val : nge){
            System.out.print(val +" ");
        }
    }
    */
    
    public static void main(String[] args) {
       int arr[] = {6,0,8,1,3};
       nextGreaterElement(arr);
       
        
    }
}
/*
op: 8 8 -1 3 -1 
*/

