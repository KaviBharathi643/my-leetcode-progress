class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            String st=word.substring(1,word.length());
            if(st.equals(st.toLowerCase())){
                return true;

            }
        }
        return false;
    }
}