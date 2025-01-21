class Solution {
    public int solution(int hp) {
        int answer = 0;
        int remainderHp = hp;
        while(remainderHp > 0) {
            if (remainderHp >= 5) {
                answer += remainderHp / 5;
                remainderHp = remainderHp % 5;
            } else if (remainderHp >= 3) {
                answer += remainderHp / 3;
                remainderHp = remainderHp % 3;
            } else if (remainderHp >= 1) {
                answer += remainderHp / 1;
                remainderHp = remainderHp % 1;
            }
        }
        return answer;
    }
}