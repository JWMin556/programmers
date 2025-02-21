class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {  // 공백일 경우 그냥 추가하기
                builder.append(ch);
            } else {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';  // 대문자인지 소문자인지 구분을 해야 한다.
                char shifted = (char) ((ch - base + n) % 26 + base);  // 시저암호 변환
                builder.append(shifted);
            }
        }
        answer = builder.toString();
        return answer;
    }
}