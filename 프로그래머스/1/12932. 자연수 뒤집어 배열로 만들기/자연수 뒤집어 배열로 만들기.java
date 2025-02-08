import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0) {
            int number = (int) (n % 10);
            list.add(number);
            n /= 10;
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}