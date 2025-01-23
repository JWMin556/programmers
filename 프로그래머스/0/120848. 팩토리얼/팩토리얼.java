class Solution {
    public int solution(int n) {
        int answer = 1;
        int factorialResult = 1;
        while(true) {
            factorialResult *= answer;
            if (factorialResult == n) { break; }
            else if (factorialResult > n) {
                answer--;
                break;
            }
            answer++;
        }
        return answer;
    }
}