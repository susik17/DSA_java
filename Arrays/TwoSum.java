
// "static void main" must be defined in a public class.
class Main {
    //3.optimal - using HashmAp
     static public int[] twoSum(int[] arr,int target){
         int n = arr.length;
         Map<Integer,Integer> m = new HashMap<>();
         for(int i=0;i<n;i++){
             int complement = target - arr[i];
             if(m.containsKey(complement)){
                 return new int[]{m.get(complement),i};
             }
             m.put(arr[i],i);
          }
         return new int[] {-1,-1};
     }
    /*
    //2.Optimal - using Two pointer
     static public int[] twoSum(int[] arr,int target){
         int n =  arr.length;
         //2-D array to store indexes of array elements -> {value , indx}
         int[][] indxArr =  new int[n][2];
         for(int i=0;i<n;i++){
             indxArr[i][0] = arr[i];
             indxArr[i][1] = i;
         }
         Arrays.sort(indxArr,Comparator.comparingInt(o -> o[0])); //sort by value
         int i = 0,j = n-1;
         while(i<j){
             int sum = indxArr[i][0] + indxArr[j][0];
             if(sum == target){
                 return new int[] {indxArr[i][1],indxArr[j][1]};
             }
             if(sum < target ){i++;}
             else{j--;}
             
         }
         return new int[]{-1,-1};
         
         
     }
    
    //1.Brute force
    static public int[] twoSum(int[] arr,int target){
        int[] ans = {-1,-1};
         int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 if(arr[i]+arr[j] == target){
                     ans[0] = i;
                     ans[1] = j;
                     //return new int[]{i,j};
                 }
                 
            }
             
        }
       return  ans;
        
    }
    */
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,10};
        int target = 10;
        int[] ans = twoSum(arr,target);
        System.out.print(ans[0]+" "+ans[1]);
    }
}