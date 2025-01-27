class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int answerLength = (my_str.length() % n) == 0 ? (my_str.length() / n) : (my_str.length() / n) + 1;
        answer = new String[answerLength];
        int start = 0;
        for (int i = 0; i < answerLength; i++) {
            int end = start + n > my_str.length() ? my_str.length() : start + n;
            answer[i] = my_str.substring(start, end);
            start = end;
        }
        return answer;
    }
}