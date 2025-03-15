import java.util.*;
class Adjacency_matrix_representation {
    //undirected graph
    public void undirected_adjmatrix(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        int[][] adj = new int[N][N];
        for(int i=0;i<E;i++){
            int f = sc.nextInt();
            int t = sc.nextInt();
            adj[f-1][t-1] = 1;
            adj[t-1][f-1] = 1;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Directed Graph
    public static void adjmatrix() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        int[][] adj = new int[N][N];
        for(int i=0;i<E;i++){
            int f = sc.nextInt();
            int t = sc.nextInt();
            adj[f-1][t-1] = 1;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
ip:
3 3
1 2
2 3
1 3
op:
0 1 1 
1 0 1 
1 1 0 
 */