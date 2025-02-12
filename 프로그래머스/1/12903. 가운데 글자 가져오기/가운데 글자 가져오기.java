class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            int indexFirst = (s.length() / 2) - 1;
            answer += s.charAt(indexFirst);
            int indexSecond = (s.length() / 2);
            answer += s.charAt(indexSecond);
        } else {
            int index = (s.length() / 2);
            answer += s.charAt(index);
        }
        return answer;
    }
}