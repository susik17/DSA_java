import java.util.*;
class Dp {
    //By using Space efficient Tabulation
    static int HouseRobber_1(int n,int[] arr){
        //edge case :
        if(n==1){return arr[0];}
        int prior_2=arr[0];
        int prior_1=Math.max(arr[0],arr[1]);
        int curr=0;
        for(int i=2;i<=n-1;i++){
            int pick=arr[i]+prior_2;
            int not_pick=prior_1;
            curr=Math.max(pick,not_pick);
            prior_2=prior_1;
            prior_1=curr;
        }
        return curr;
    }
    
    /*
    //3.by using Tabulation
    static int HouseRobber_1(int n,int[] arr){
        //edge case :
        if(n==1){return arr[0];}
        int[] dp=new int[n];
        for(int k=0;k<=n-1;k++){
            dp[k]=-1;
        }
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<=n-1;i++){
            int pick=arr[i]+dp[i-2];
            int not_pick=dp[i-1];
            dp[i]=Math.max(pick,not_pick);
        }
        return dp[n-1];
    }
    //2.By using memoization 
    static int HouseRobber_1(int i,int[] arr,int[] dp){
        //Basecase
        if(i==0){ return arr[0];}
        if(i==1){ return Math.max(arr[0],arr[1]);}
        //check
        if(dp[i]!=-1){ return dp[i];}
        int pick=arr[i]+HouseRobber_1(i-2,arr,dp);
        int not_pick=HouseRobber_1(i-1,arr,dp);
        dp[i]=Math.max(pick,not_pick);
        return dp[i];
    }
    //1.By using Recursion
    static int HouseRobber_1(int i,int[] arr){
        //Basecase
        if(i==0){ return arr[0];}
        if(i==1){ return Math.max(arr[0],arr[1]);}
        int pick=arr[i]+HouseRobber_1(i-2,arr);
        int not_pick=HouseRobber_1(i-1,arr);
        return Math.max(pick,not_pick);
    }
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        //int recursion_op=HouseRobber_1(n-1,arr);
        int[] dp = new int[n];
        for(int i=0;i<=n-1;i++){
            dp[i]=-1;
        }
        //int memoization_op=HouseRobber_1(n-1,arr,dp);
        //int Tabulation_op=HouseRobber_1(n,arr);
        int Tabulation2_op=HouseRobber_1(n,arr);
        System.out.println(Tabulation2_op);
        
        
        
    }
}
/*
ip1:
4
30 40 10 50
op1:
90
ip2:
6
20 70 90 30 10 50
op2:
160
*/

