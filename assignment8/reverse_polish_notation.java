package assignment8;

import java.util.ArrayDeque;

public class reverse_polish_notation {
    class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int q = stack.pop();
                int p = stack.pop();
                int res = 0;
                
                switch (s) {
                    case "+": res = p + q; break;
                    case "-": res = p - q; break;
                    case "*": res = p * q; break;
                    case "/": res = p / q; break;
                }
                
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        
        return stack.pop();
    }
}

    
}
