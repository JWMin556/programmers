import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] temp = Arrays.stream(numbers.clone()).sorted().toArray();
        int arbitaryA = temp[temp.length - 1] * temp[temp.length - 2];
        int arbitaryB = temp[0] * temp[1];
        answer = (arbitaryA > arbitaryB) ? arbitaryA : arbitaryB;
        return answer;
    }
}