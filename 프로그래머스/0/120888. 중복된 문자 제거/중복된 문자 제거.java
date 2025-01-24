class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (i == 0) { answer += my_string.charAt(i); }
            else {
                for (int j = answer.length(); j > 0; j--) {
                    if (my_string.charAt(i) == answer.charAt(j - 1)) { break; }
                    if (j - 1 == 0) { answer += my_string.charAt(i); }
                }
            }
        }
        return answer;
    }
}