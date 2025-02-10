import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        answer = Arrays.stream(answer).sorted().toArray();
        if (answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}