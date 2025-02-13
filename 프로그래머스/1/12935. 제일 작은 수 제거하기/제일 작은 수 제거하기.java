import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    list.add(arr[i]);
                }
            }
            answer = list.stream().mapToInt(i -> i).toArray();
        }
        return answer;
    }
}