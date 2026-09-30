class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.empty()){
                stack.push(ch);
            }
            else if(ch==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        String k="";
        while(!stack.empty()){
            k+=stack.pop();
        }
        String rev = new StringBuilder(k).reverse().toString();
        return rev;
    }
}