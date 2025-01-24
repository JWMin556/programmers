import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int[] soredSides = Arrays.stream(sides).sorted().toArray();
        int sum = soredSides[0] + soredSides[1];
        if (soredSides[2] < sum) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}