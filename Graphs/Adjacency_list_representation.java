import java.util.*;
class Solution {
    //Undirected graph
    public static List<List<Integer>> undirected_adjList() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
       List<List<Integer>> adj = new ArrayList<>();
       for(int i=0;i<=N;i++){
           adj.add(new ArrayList<Integer>());
       }
       for(int i=0;i<E;i++){
           int f = sc.nextInt(); //from-f 
           int t = sc.nextInt();//to-t
           adj.get(f).add(t);
           adj.get(t).add(f);
       }
       return adj;
       /*
       //print 
       for(int i=0;i<N;i++){
           System.out.print(i+"->");
           for(int k:adj.get(i)){
               System.out.print(k+" ");
           }
        System.out.println();
       }
       */
      //Directed graph
      public List<List<Integer>> directed_adjList() {
        // Write your code here...
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
       List<List<Integer>> adj = new ArrayList<>();
       for(int i=0;i<=N;i++){
           adj.add(new ArrayList<Integer>());
       }
       for(int i=0;i<E;i++){
           int f = sc.nextInt(); //from-f 
           int t = sc.nextInt();//to-t
           adj.get(f).add(t);
       }
       return adj;
        
        
    }
    }
}

/*
ip:
3 3
1 2
1 3
2 3
op:
1 -> 2 -> 3
2 -> 1 -> 3
3 -> 1 -> 2
*/
