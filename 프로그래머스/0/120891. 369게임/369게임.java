import java.util.ArrayList;

class Solution {
    public int solution(int order) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (order > 0) {
            list.add(order % 10);
            order /= 10;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3 || list.get(i) == 6 || list.get(i) == 9) {
                answer++;
            }
        }
        return answer;
    }
}