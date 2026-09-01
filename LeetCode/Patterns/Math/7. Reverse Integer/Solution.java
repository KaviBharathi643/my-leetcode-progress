class Solution {
    public int reverse(int x) {
        int y=Math.abs(x);
        int r=0;
        int rev=0;
        while(y>0){
            r=y%10;
            rev=(rev*10)+r;
            y=y/10;
        }
        if(rev<Math.pow(2,31)){
        if(x<0){
            return rev-(rev*2);
        }
        return rev;}
        return 0;
    }
}