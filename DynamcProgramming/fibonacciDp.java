import java.util.Scanner;
class DP {
    
   //Dynamic Programming-Space Efficient tabulation
   static int fibonacci(int n){
       if(n==0) return 0;
       if(n==1) return 1;
       int prior_1=1;
       int prior_2=0;
       int current=0;
       for(int i=2;i<=n;i++){
           current=prior_1+prior_2;
           prior_2=prior_1;
           prior_1=current;
       }
       return current;
   }
   /* 
    //Dynamic programming-Tabulation
    static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
    
 
    //Dynamic programming-Memoization
    static int  fibonacci(int n,int[] dp){
        if(n==0){ return 0;}
        if(n==1){return 1;}
        if(dp[n]!=-1){return dp[n];}
        dp[n]=fibonacci(n-1,dp)+fibonacci(n-2,dp);
        return dp[n];
    }
     */
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        //System.out.print(fibonacci(n,dp));
        System.out.print(fibonacci(n));
       
    }
    
}