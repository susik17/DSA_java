import java.util.*;
class FindSingleElement {
    //optimal
    static int FindSingleElement(int[]arr,int n){
        int XOR=0;
        for(int i=0;i<n;i++){
            XOR=XOR^arr[i];
        }
        return XOR;
    }
    /*
    //Better-2(Hashmap)
    static int FindSingleElement(int[]arr,int n){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
    
    
    //Better-1 (Hashing)
    static int FindSingleElement(int[]arr,int n){
        int max=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] temp=new int[max+1];
        for(int i=0;i<temp.length;i++){
            temp[i]=0;
        }
        for(int i=0;i<=n-1;i++){
            temp[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(temp[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;
    }
    //bruteforce
    static int FindSingleElement(int[]arr,int n){
        for(int i=0;i<=n-1;i++){
            int count=0;
            for(int j=0;j<=n-1;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        int ans=FindSingleElement(arr,n);
        System.out.print(ans);
        
    }
}
*/
/*
IP:
9
7 4 5 9 6 5 4 9 7
OP:
6
*/

