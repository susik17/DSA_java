import java.util.*;

class UnionOfSortedArrays {
    //optimal
    static ArrayList<Integer> find_union(ArrayList<Integer> a,ArrayList<Integer> b){
        int i=0;
        int j=0;
        ArrayList<Integer> ans =new ArrayList<>();
        while(i<a.size()&& j<b.size()){
        if(a.get(i)<=b.get(j)){
            //add when ans is empty or lastadded element in ans is not equals to correct adding element
            if(ans.isEmpty()||((ans.get(ans.size()-1))!=a.get(i))){
                ans.add(a.get(i));
            }
            i++;
        }else{
            if(ans.isEmpty()||((ans.get(ans.size()-1))!=b.get(j))){
                ans.add(b.get(j));
            }
            j++;
        
        }
    }
    //add remaining
    while(i<a.size()){
        if(ans.isEmpty()||((ans.get(ans.size()-1))!=a.get(i))){
                ans.add(a.get(i));
            }
            i++;
    }
    while(j<b.size()){
        if(ans.isEmpty()||((ans.get(ans.size()-1))!=b.get(j))){
                ans.add(b.get(j));
            }
            j++;
    }
    return ans;
}
    
    /*bruteforce
    static ArrayList<Integer> find_union(ArrayList<Integer> a,ArrayList<Integer> b){
        ArrayList<Integer> ans=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        s.addAll(a);
        s.addAll(b);
        ans.addAll(s);
        return ans;
    }
    */
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
    ArrayList<Integer> ans=find_union(a,b);
    for(int k:ans){
        System.out.print(k+" ");
    }
  }
}
/*
ip:
8 4 
3 5 5 6 7 8 8 8
1 2 3 5
op:
1 2 3 5 6 7 8 
*/
