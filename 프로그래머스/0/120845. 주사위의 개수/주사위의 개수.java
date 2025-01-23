class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int maxWidth = box[0] / n;  // 최대가로
        int maxLength = box[1] / n; //최대세로
        int maxHeight = box[2] / n;  // 최대높이
        answer = maxWidth * maxLength * maxHeight;
        return answer;
    }
}