import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // 이렇게 문자열을 정렬할 수 있다.

        int count = 0;
        answer += chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                if (!answer.equals("") && (count < 1)) {
                    answer = answer.substring(0, answer.length() - 1);
                }
                count++;
            } else {
                count = 0;
            }

            if (count == 0) { answer += chars[i]; }
        }
        return answer;
    }
}