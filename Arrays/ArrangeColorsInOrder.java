import java.util.*;

class Solution {
    /* 
    //solution - 1 Bruteforce
     public static void arrangeColorsInOrder(int[] arr) {
        Arrays.sort(arr);
    }
    
    //solution - 2 -based on Occurances
    public static void arrangeColorsInOrder(int[] arr) {
        int n = arr.length;
        int[] count = new int[3];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (i < count[0]) {
                arr[i] = 0;
            } else if (i < count[0] + count[1]) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }
    }
    */
    
    
    //solution - 3
    //Dutch National flag algorithm
    static void swap(int[] arr,int i,int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
    public static void arrangeColorsInOrder(int[] arr) {
             int n = arr.length;
             int mid = 0;//for traversal
             int left = 0,right = n-1;
             while(mid<=right){
                     if(arr[mid] == 0){
                         swap(arr,left,mid);
                         left++;
                         mid++;
                     }
                     else if(arr[mid] == 1){
                         mid++;
                     }
                     else if(arr[mid] == 2) {
                         swap(arr,right,mid);
                         right--;
                     }
                 }
                }
            
        
        
                 /* 
    }
    public static void arrangeColorsInOrder(int[] arr) {
             int n = arr.length;
             int k = 0;//for traversal
             int left = 0,right = n-1;
             while(k<=right){
                     if(arr[k] == 0){
                         swap(arr,left,k);
                         left++;
                         k++;
                     }
                     else if(arr[k] == 1){
                         k++;
                     }
                     else if(arr[k] == 2) {
                         swap(arr,right,k);
                         right--;
                     }
                 }
            
        
        
    }
}

 N = 7,
arr = [2, 0, 1, 1, 2, 0, 1]

op:0 0 1 1 1 2 2
 */