class Solution {
    public int solution(String s) {
        int answer = 0;
        if (s.charAt(0) == '-') {
            int number = Integer.parseInt(s.substring(1));
            answer = -number;
        } else {
            int number = Integer.parseInt(s);
            answer = number;
        }
        return answer;
    }
}