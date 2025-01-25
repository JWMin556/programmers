class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            Character c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += c.toString().toLowerCase();
            } else {
                answer += c.toString().toUpperCase();
            }
        }
        return answer;
    }
}