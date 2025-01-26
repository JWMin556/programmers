import java.util.ArrayList;

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int index = 10;
        ArrayList<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % index);
            num /= index;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == k) {
                answer = list.size() - i;
                break;  // 가장 처음만 있으면 되니까 바로 break로 탈출
            }
        }
        return answer;
    }
}