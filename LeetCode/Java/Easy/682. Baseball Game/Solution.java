import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        int k = 0;
        Stack<Integer> stack = new Stack<>();

        for (String ch : operations) {

            if (ch.equals("C")) {
                stack.pop();
            }
            else if (ch.equals("D")) {
                int n = stack.peek();
                stack.push(n * 2);
            }
            else if (ch.equals("+")) {
                int n = stack.pop();
                int sum = n + stack.peek();
                stack.push(n);
                stack.push(sum);
            }
            else {
                stack.push(Integer.parseInt(ch));
            }
        }

        while (!stack.empty()) {
            k += stack.pop();
        }

        return k;
    }
}