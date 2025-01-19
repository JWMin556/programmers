class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n <= slice) {
            answer = 1;
        } else {
            if (n % slice == 0) { answer = (n / slice); }
            else { answer = 1 + (n / slice); }
        }
        return answer;
    }
}