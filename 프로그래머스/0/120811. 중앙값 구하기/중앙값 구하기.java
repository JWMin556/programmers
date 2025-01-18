import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = Arrays.stream(array).sorted().toArray();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length/2) {
                answer = arr[i];
                break;
            }
        }
        return answer;
    }
}