import java.util.Scanner;
class ClimbingStairs {
    
   //Dynamic Programming-Space Efficient tabulation
   static int f(int n){
       if(n==0) return 1;
       if(n==1) return 1;
       int prior_1=1;
       int prior_2=1;
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
    static int f(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
    
    //Dynamic programming-Memoization
    static int  f(int n,int[] dp){
        if(n==0){ return 1;}
        if(n==1){return 1;}
        if(dp[n]!=-1){return dp[n];}
        dp[n]=f(n-1,dp)+f(n-2,dp);
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
        //System.out.print(f(n,dp));
        System.out.println(f(n));
       
    }

}

/*
 ip:5
 op:8
 */