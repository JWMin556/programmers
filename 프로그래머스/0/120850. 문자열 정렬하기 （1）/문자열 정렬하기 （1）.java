import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            Character c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                list.add(c - '0');
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        answer = Arrays.stream(answer).sorted().toArray();
        return answer;
    }
}