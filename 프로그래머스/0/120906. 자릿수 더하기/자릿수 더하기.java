class Solution {
    public int solution(int n) {
        int answer = 0;
        int index = 10;
        while (n > 0) {
            answer += (n % index);
            n /= index;
        }
        return answer;
    }
}