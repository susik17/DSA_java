
class maxNestinhg_depth {
    public static int maxNestingDepth(String s) {
        int n = s.length();
        int count= 0,max_value = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                count += 1;
                max_value = Math.max(count,max_value);
            }
            else if(s.charAt(i) == ')'){
                count -= 1;
            }
            
        }
        return max_value;
    }
}
/*
ip:
(3+(2*5)+(1+(4/2))+2)
op:
3
*/
