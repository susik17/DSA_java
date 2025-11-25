// "static void main" must be defined in a public class.
 class Main {
    //last - prev day  selected task
    /*
    public static int f(int day,int last,int[][] points){
        //basecase
        if(day == 0){
            int maxi = 0;
            for(int task = 0;task<3;task++){
                if(task != last){
                    maxi = Math.max(maxi,points[0][task]);
                }
            }
            return maxi;
        }
        
        int maxi = 0;
        for(int task=0;task<3;task++){
            if(task != last){
                int activity = points[day][task] + f(day-1,task,points);
                maxi = Math.max(maxi,activity);
            }
         }
        return maxi;  
    }
    */
    //memoization
    public static int f(int day,int last,int[][] points,int[][] dp){
        
        //1.check before store
        if(dp[day][last] != -1) return dp[day][last];
        //basecase
        if(day == 0){
            int maxi = 0;
            for(int task = 0;task<3;task++){
                if(task != last){
                    maxi = Math.max(maxi,points[0][task]);
                }
            }
            return maxi;
        }
        
        int maxi = 0;
        for(int task=0;task<3;task++){
            if(task != last){
                int activity = points[day][task] + f(day-1,task,points,dp);
                maxi = Math.max(maxi,activity);
            }
         }
        //2.store 
        return dp[day][last] = maxi;  
    }
    
    public static void main(String[] args) {
        int[][] points = {{10,50,1},
                       {5,100,11}};
        int n = points.length;
        int[][] dp = new int[n][4];
       for(int i=0;i<n;i++){
           for(int j=0;j<4;j++){
                dp[i][j] = -1;
        }
       }

        //System.out.println(n);
       // System.out.println(f(n-1,3,points)); //3-no sport selected 
         System.out.println(f(n-1,3,points,dp));
        
        
    }
}