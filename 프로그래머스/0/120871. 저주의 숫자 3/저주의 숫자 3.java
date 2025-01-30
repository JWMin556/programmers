class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            String answerString = String.valueOf(answer);
            while (answer % 3 == 0 || answerString.contains("3")) {
                answer++;
                answerString = String.valueOf(answer);
            }
        }
        return answer;
    }
}