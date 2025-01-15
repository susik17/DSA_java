import java.util.*;
class DP {
    //By using Memory Efficient Tabulation
     static int FrogJump(int i,int[] heights){
         if(i==0){ return 0;}
        if(i==1){return Math.abs(heights[0]-heights[1]);}
         int prior_1 = 0;
         int prior_2 = Math.abs(heights[0]-heights[1]);
         int current=0;
         for(int j=2;j<=i;j++){
             int step1=Math.abs(heights[j]-heights[j-1])+prior_1;
             int step2 = Math.abs(heights[j]-heights[j-2])+prior_2;
             current = Math.min(step1,step2);
             prior_2 = prior_1;
             prior_1= current;
         }
         return current;
     }
    
     /*
    //By using Tabulation
    static int FrogJump(int i,int[] heights){
        if(i==0){ return 0;}
        if(i==1){return Math.abs(heights[0]-heights[1]);}
        int n=heights.length;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=Math.abs(heights[0]-heights[1]);
        for(int j=2;j<=i;j++){
            int step1 = Math.abs(heights[j]-heights[j-1])+dp[j-1];
            int step2 = Math.abs(heights[j]-heights[j-2])+dp[j-2];
            dp[j]=Math.min(step1,step2);
        }
        return dp[i];
        
    }
    
    //By using Memoization
    static int FrogJump(int i,int[] heights,int[] dp){
        if(i==0){ return 0;}
        if(i==1){return Math.abs(heights[0]-heights[1]);}
        //check
        if(dp[i]!=-1){ return dp[i];}
        int step1=Math.abs(heights[i]-heights[i-1])+FrogJump(i-1,heights,dp);
        int step2=Math.abs(heights[i]-heights[i-2])+FrogJump(i-2,heights,dp);
        //store 
        dp[i]=Math.min(step1,step2);
        return dp[i];
        
    
        }
    
    //By using Recursion
    static int FrogJump(int i,int[] heights){
        //Base Case 
        if(i==0){return 0;}
        if(i==1){return Math.abs(heights[0]-heights[1]);}
        int step1=Math.abs(heights[i]-heights[i-1])+FrogJump(i-1,heights);
        int step2=Math.abs(heights[i]-heights[i-2])+FrogJump(i-2,heights);
        return Math.min(step1,step2);
        
    }
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i=0;i<=n-1;i++){
            heights[i]=sc.nextInt();
        }
        //int Recursion_op=FrogJump(n-1,heights);
        int[] dp =  new int[n+1];
        for (int i=0;i<=n;i++){
            dp[i]=-1;
        }
        //int Memoization_op=FrogJump(n-1,heights,dp);
        int tabulation_op = FrogJump(n-1,heights);
        System.out.println(tabulation_op);
    }
}

/*
ip1:
4 
80 90 120 100
op1:
20 
ip2:
6
50 30 80 30 80 70
op2:
40
*/