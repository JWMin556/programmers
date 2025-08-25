import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int num = commands.length;
        int[] answer = new int[num];
        
        for (int i = 0; i < num; i++) { 
            int from = commands[i][0];
            int to = commands[i][1];
            int index = commands[i][2];
            
            int[] temp = new int[to - from + 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[from - 1 + j];
            }
            
            Arrays.sort(temp);
            
            answer[i] = temp[index - 1];
        }
        return answer;
    }
}