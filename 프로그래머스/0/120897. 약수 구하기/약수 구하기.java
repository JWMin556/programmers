import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}