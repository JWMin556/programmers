import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArr = s.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if (c == '(') {
                stack.push(c);
            } else {
                if (i == 0) {
                    break;
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } 
            }
            
            if (i == charArr.length-1 && stack.isEmpty()) {
                answer = true;
            }
        }
        
        return answer;
    }
}