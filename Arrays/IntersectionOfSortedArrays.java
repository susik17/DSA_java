import java.util.*;

class IntersectionOfSortedArrays {
    /* 
    //Bruteforce
    static ArrayList<Integer> find_intersection(ArrayList<Integer> a,ArrayList<Integer> b){
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i = 0; i < b.size(); i++) {
            temp.add(0);
        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if ((a.get(i)==b.get(j)) && temp.get(j) == 0) {
                    ans.add(a.get(i));
                    temp.set(j, 1);
                    break;
                } 
                else if (a.get(i) < b.get(j)) {
                    break;
                }
            }
        }
    return ans;
    }*/
    
    static ArrayList<Integer> find_intersection(ArrayList<Integer> a,ArrayList<Integer> b){
        int i=0;
        int j=0;
        ArrayList<Integer> ans =new ArrayList<>();
        while(i<a.size()&& j<b.size()){
            if(a.get(i)<=b.get(j)){
                if(a.get(i)==b.get(j)){
                    ans.add(a.get(i));
                    i++;
                    j++;
                }
                else{
                    i++;
                }
            }
            else{
                j++;
            }
        }

    return ans;
}
    
   
  public static void main(String[] args) {
    Scanner  sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    ArrayList<Integer> a=new ArrayList<>();
    ArrayList<Integer> b=new ArrayList<>();
    for(int i=0;i<=m-1;i++){
        int temp=sc.nextInt();
        a.add(temp);
    }
    for(int i=0;i<=n-1;i++){
        int temp=sc.nextInt();
        b.add(temp);
    }
    ArrayList<Integer> ans=find_intersection(a,b);
    for(int k:ans){
        System.out.print(k+" ");
    }
  }
}
/*
ip:
8 6
3 5 5 6 7 8 8 8
1 2 3 5 8 9
op:
3 5 8
*/


