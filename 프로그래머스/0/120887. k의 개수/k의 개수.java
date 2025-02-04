class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char numberK = (char) ((char) k + '0');
        for (int x = i; x <= j; x++) {
            String numberString = Integer.toString(x);
            for (int y = 0; y < numberString.length(); y++) {
                char numberChar = numberString.charAt(y);
                if (numberChar == numberK) {
                    answer++;
                }
            }
        }
        return answer;
    }
}