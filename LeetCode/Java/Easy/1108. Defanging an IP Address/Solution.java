class Solution {
    public String defangIPaddr(String address) {
        String s="";
        for(char i:address.toCharArray()){
            if(i=='.'){
                s+="[.]";
            }
            else{
                s+=i;
            }
        }
        return s;
    }
}