import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numbers = s.split("\\s");
        int[] numbersInts = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersInts[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(numbersInts);
        answer = numbersInts[0] + " " + numbersInts[numbers.length - 1];
        return answer;
    }
}