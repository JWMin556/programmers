class Solution {
    public int solution(int chicken) {
        int answer = 0; // 서비스로 받는 치킨의 수
        while (chicken >= 10) {
            chicken -= 10;
            answer++;
            chicken++;
        }
        return answer;
    }
}