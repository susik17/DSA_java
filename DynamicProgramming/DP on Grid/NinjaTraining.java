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
    
     //Tabulation
      public static int f(int days,int[][] points){
        // dp[i][j] represents the maximum points at day i, considering the last activity as j   
          int[][] dp = new int[days][4];
        
        //1.Define BaseCases 
          dp[0][0] = Math.max(points[0][1],points[0][2]);
          dp[0][1] = Math.max(points[0][0],points[0][2]);
          dp[0][2] = Math.max(points[0][0],points[0][1]);
          dp[0][3] = Math.max(points[0][2] ,Math.max(points[0][0],points[0][1]));
        
          
          //fill dp table for day 1 -> n-1
          for(int day = 1; day < days ; day++){
              for(int last = 0;last <=3 ;last++ ){ // last goes till 3 
                  //recurrance code - change in maxi place - dp[day][last],also fn call
                   dp[day][last] = 0;
                   for(int task=0;task<3;task++){
                       if(task != last){
                       int activity = points[day][task] + dp[day-1][task];
                       dp[day][last] = Math.max(dp[day][last],activity);
            }
         }
                  
           }
         }
       
        //2.store 
        return dp[days-1][3]; 
    }
     */
     //Space Optimization
      static public int f(int n, int[][] points) {
        // Initialize a vector to store the maximum points for the previous day's activities
        int[] prev = new int[4];

        // Initialize the DP table for the first day (day 0)
        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);
        prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        // Iterate through the days starting from day 1
        for (int day = 1; day < n; day++) {
            // Create a temporary array to store the maximum points for the current day's activities
            int[] curr = new int[4];
            for (int last = 0; last < 4; last++) {
                curr[last] = 0;
                // Iterate through the tasks for the current day
                for (int task = 0; task <= 2; task++) {
                    if (task != last) {
                        // Calculate the points for the current activity and add it to the
                        // maximum points obtained on the previous day (stored in prev)
                        curr[last] = Math.max(curr[last], points[day][task] + prev[task]);
                    }
                }
            }
            // Update prev with the maximum points for the current day
            prev = curr;
        }

        // The maximum points for the last day with any activity can be found in prev[3]
        return prev[3];
    }
    public static void main(String[] args) {
        int[][] points = {{10,50,1},
                       {5,100,11}};
        int n = points.length;
        //int[][] dp = new int[n][4];
       //for(int i=0;i<n;i++){
          // for(int j=0;j<4;j++){
            //    dp[i][j] = -1;}}

        //System.out.println(n);
       // System.out.println(f(n-1,3,points)); //3-no sport selected 
        // System.out.println(f(n-1,3,points,dp));
        System.out.println(f(n, points));
        

        
        
    }
}