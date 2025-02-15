import java.util.*;
class Triathlontraining {
    static int fn(int i,int sport,int[][] points,int[][] dp){
        if(i<0){return 0;}
        if(dp[i][sport]!=-1){return dp[i][sport];}
        int left=fn(i-1,(sport+1)%3,points,dp);
        int right=fn(i-1,(sport+2)%3,points,dp);
        return dp[i][sport]=points[i][sport]+Math.max(left,right);
    }
    static int training(int n,int[][] points){
        int[][] dp=new int[n][3];
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=2;j++)
            {
                dp[i][j]=-1;
            }
        }
        int a=fn(n-1,0,points,dp);
        int b=fn(n-1,1,points,dp);
        int c=fn(n-1,2,points,dp);
        return Math.max(Math.max(a,b),c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][3];
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=2;j++)
            {
                points[i][j]=sc.nextInt();
            }
        }
        
        
        System.out.println(training(n,points));
        
    }
}
/*
ip:
2
4 20 5
5 50 9
op:
55
 */