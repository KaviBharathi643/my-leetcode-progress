class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
int n=haystack.indexOf(needle);
        return n;
        }
        return -1;
    }
}