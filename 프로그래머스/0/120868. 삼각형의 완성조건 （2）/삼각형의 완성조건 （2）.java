import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        // sides에 가장 긴 변이 있을 경우
        for (int i = sides[1] - sides[0] + 1; i <= sides[1]; i++) {
            answer++;
        }

        // 나머지 한 변이 가장 긴 변인 경우
        for (int i = sides[1] + 1; i < sides[0] + sides[1]; i++) {
            answer++;
        }
        return answer;
    }
}