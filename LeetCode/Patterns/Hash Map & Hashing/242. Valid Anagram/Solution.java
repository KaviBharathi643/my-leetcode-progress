class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ss=s.charAt(i);
            char tt=t.charAt(i);
            arr[ss-'a']+=1;
            arr[tt-'a']-=1;
        }
        for(int i:arr){
        if(i!=0){
            return false;
        }}
        return true;
    }
}