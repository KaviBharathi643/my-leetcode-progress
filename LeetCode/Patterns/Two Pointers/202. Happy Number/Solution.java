class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        set.add(n);
       while(n>=1){
        if(n==1){
            return true;
        }
        
        int s=0;
        while(n>0){
            int digit=n%10;
            s+=digit*digit;
            n/=10;
        }
        if(set.contains(s)){
            return false;
        }
        set.add(s);
        n=s;
       } 
       return false;
    }
}