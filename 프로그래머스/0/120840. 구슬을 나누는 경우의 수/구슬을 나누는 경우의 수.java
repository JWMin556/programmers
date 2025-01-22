class Solution {    
    public int solution(int balls, int share) {
        int answer = 0;
        long result = 1;
        for (int i = 0; i < share; i++) {
            result *= (balls - i);
            result /= (i + 1);
        }
        answer = (int) result;
        return answer;
    }
}