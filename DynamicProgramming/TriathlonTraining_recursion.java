import java.util.*;
class Triathlontraining {
    static int fn(int i,int sport,int[][] points){
        //Base Case 
        if(i<0){ return 0;}
        int left=fn(i-1,(sport+1)%3,points);
        int right=fn(i-1,(sport+2)%3,points);
        return points[i][sport]+Math.max(left,right);
        /*
        if(sport==0){
            return points[i][0]+Math.max(fn(i-1,1,points),fn(i-1,2,points));
        }
        if(sport==1){
            return points[i][1]+Math.max(fn(i-1,0,points),fn(i-1,2,points));
        }
        if(sport==2){
            return points[i][2]+Math.max(fn(i-1,0,points),fn(i-1,1,points));
        }
    */
        }
    static int training(int n,int[][] points){
       
        int a=fn(n-1,0,points);
        int b=fn(n-1,1,points);
        int c=fn(n-1,2,points);
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