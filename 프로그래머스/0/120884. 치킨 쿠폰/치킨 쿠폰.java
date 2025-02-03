class Solution {
    public int solution(int chicken) {
        int answer = 0; // 서비스로 받는 치킨의 수
        while (chicken >= 10) { // 나는 이 문제에서 쿠폰이라는 존재를 생각하지 않고 풀었음
            chicken -= 10;
            answer++;
            chicken++;
        }
        return answer;
    }
}