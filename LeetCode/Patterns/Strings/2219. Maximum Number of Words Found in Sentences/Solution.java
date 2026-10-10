class Solution {
    public int mostWordsFound(String[] sentences) {
        String[] s={"kavi"};
        int ma=0;
        for(int i=0;i<sentences.length;i++){
        s = sentences[i].split(" ");
            int l=s.length;
            if(l>ma){
                ma=l;
            }
        }
        return ma;
    }
}