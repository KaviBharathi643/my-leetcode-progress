class Solution {
    public int addDigits(int num) {
        
        while(num>9){
            int nu=num;
            
            int su=0;
            while(nu>0){
                int digit=nu%10;
                su+=digit;
                nu/=10;
            }
            num=su;
        }
        return num;
    }
}