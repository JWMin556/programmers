import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuffer sb = new StringBuffer(new String(chars));
        answer = sb.reverse().toString();
        return answer;
    }
}