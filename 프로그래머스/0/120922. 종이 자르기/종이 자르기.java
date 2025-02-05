class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int widthCount = M - 1;
        int heightCount = (N - 1) * M;
        answer = widthCount + heightCount;
        return answer;
    }
}