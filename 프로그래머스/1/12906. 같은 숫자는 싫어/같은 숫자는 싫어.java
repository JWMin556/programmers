import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        boolean flag = false;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                flag = true;
            } else {
                flag = false;
            }

            if (!flag) {
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}