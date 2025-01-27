import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] my_char = my_string.toLowerCase().toCharArray();
        Arrays.sort(my_char);
        for (int i = 0; i < my_char.length; i++) {
            answer += my_char[i];
        }
        return answer;
    }
}