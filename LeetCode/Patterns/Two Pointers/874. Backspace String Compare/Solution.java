class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        int l1=s.length();
        int l2=t.length();
        for(int i=0;i<l1;i++){
            char ch=s.charAt(i);
            if(ch=='#'){
if(!s1.empty()){
                s1.pop();
            }            }
            else{
                s1.push(ch);
            }
        }
        for(int i=0;i<l2;i++){
            char ch=t.charAt(i);
            if(ch=='#'){
                if(!s2.empty()){
                s2.pop();
            }}
            else{
                s2.push(ch);
            }
        }
        while(!s1.empty() && !s2.empty()){
            if(!s1.pop().equals(s2.pop())){
                return false;
            }
        }
        if(s1.empty() && s2.empty()){
            return true;
        }
        else{
            return false;
        }

    }
}