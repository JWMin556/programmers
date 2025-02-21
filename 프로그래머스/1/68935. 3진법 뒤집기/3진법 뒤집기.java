import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            if (n < 3) { list.add(n); break; }
            int digit = n % 3;
            list.add(digit);
            n /= 3;
        }
        int index = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            int num = list.get(i);
            answer += Math.pow(3, index) * num;
            index++;
        }
        return answer;
    }
}