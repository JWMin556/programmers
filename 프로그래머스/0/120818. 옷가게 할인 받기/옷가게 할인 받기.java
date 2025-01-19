class Solution {
    public int solution(int price) {
        int answer = 0;       
        if (price >= 500000) {
            answer = (int)(price * 0.8); // 20% 할인
        } else if (price >= 300000) {
            answer = (int)(price * 0.9); // 10% 할인
        } else if (price >= 100000) {
            answer = (int)(price * 0.95); // 5% 할인
        } else {
            answer = price; // 할인 없음
        }
        return answer;
    }
}