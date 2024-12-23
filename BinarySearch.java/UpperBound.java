class UpperBound{
    static int upperBound(int[] arr, int n, int x) {
       int low=0;
       int high=n-1;
       int ans=n;
       while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]>x){
               ans=mid;
               high=high-1;
           }
           else{
               low=low+1;
           }
       }
       return ans;
   }
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int x=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<=n-1;i++){
           arr[i]=sc.nextInt();
       }
       
       System.out.print(upperBound(arr,n,x));
       
       
   }
}
/*
ip:
5 5
1 4 5 10 13
op:
3
*/