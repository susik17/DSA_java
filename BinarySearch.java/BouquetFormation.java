import java.util.*;

class Bouquet {
    static int no_of_bouquets(int[] arr,int n,int k,int day){
        int count=0, bouquet=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]<=day){
                count++;
                if(count==k){
                    bouquet++;
                    count=0;
                }
            }
            else{
                    count=0;
                }
            }
            return bouquet;
    }
     static int BouquetFormation(int[] arr,int n,int k,int m){
        if(n < m*k){ return -1;}
        /*int minValue=arr[0];
        int maxValue=arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
            if(arr[i]<minValue){
                minValue=arr[i];
            }
            
        }
        */
        int minValue=Arrays.stream(arr).min().getAsInt();
        int maxValue=Arrays.stream(arr).max().getAsInt();
        int low=minValue;
        int high=maxValue;
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(no_of_bouquets(arr,n,k,mid)>=m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
         
     }
    /*
    //brute
    static int BouquetFormation(int[] arr,int n,int k,int m){
        if(n < m*k){ return -1;}
        int minValue=arr[0];
        int maxValue=arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
            if(arr[i]<minValue){
                minValue=arr[i];
            }
            
        }
        for(int day=minValue;day<=maxValue;day++){
            if(no_of_bouquets(arr,n,k,day)>=m){
                return day;
            }
        }
        return -1;
        
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(BouquetFormation(arr, n, k, m));
        scanner.close();
    }
}
/*
ip1:
6 2 2 
2 1 1 2 3 3
op1:
2 
ip2:
6 4 2 
5 7 4 3 6 7
op2:
-1
*/
