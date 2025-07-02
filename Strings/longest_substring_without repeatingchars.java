import java.util.Scanner;
class Main {
    //optimal
    static int longest_substring(String s){
       int n = s.length();
        HashMap<Character, Integer> m = new HashMap<>();

        int i = 0;
        int maxi = 0;

        for (int j = 0; j < n; j++) {
            if (m.containsKey(s.charAt(j))) {
                if (m.get(s.charAt(j)) >= i) {
                    i = m.get(s.charAt(j)) + 1;
                }
            }
            m.put(s.charAt(j), j);
            maxi = Math.max(maxi, j - i + 1);
        }

        return maxi;
      }
    /*
    //Better
    static int longest_substring(String s){
        int n = s.length();
        int max_length = 0;
        Map<Character,Integer> m = new HashMap<>();
        int i = 0,j = 0 ;
        while(j<n){
            //not +nt inside window  - increase window size
            if (!m.containsKey(s.charAt(j)) || m.get(s.charAt(j)) == 0){
                m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
                max_length = Math.max(max_length,j-i+1);
                j++;
                 }
            //already present on window - reduce window size
            else{
                m.put(s.charAt(i),m.get(s.charAt(i))-1);
                i++;
            }   
        }
        return max_length;
      }
      
    //Brute force - o(n^3)
    static boolean check(String s,int i,int j){
        Map<Character,Integer> m = new HashMap<>();
        for(int k = i;k<=j;k++){
            if(m.containsKey(s.charAt(k))){
                return false;
            }
            m.put(s.charAt(k),1);
        }
        return true;
      }
    static int longest_substring(String s){
        int n = s.length();
        int max_length = 0;
        for(int i = 0;i<=n-1;i++){
            for(int j=i+1;j<n;j++){
                if(check(s,i,j)){
                   max_length = Math.max(max_length,j-i+1);
                }
             }
        }
        return max_length;
    }
    */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int length = longest_substring(s);
        System.out.println(length);
    }
}
/*
 ip:abacdefg
 op:7
 */
