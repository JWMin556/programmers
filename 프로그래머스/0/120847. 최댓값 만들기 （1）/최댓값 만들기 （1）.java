import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        answer = sortedNumbers[sortedNumbers.length - 1] * sortedNumbers[sortedNumbers.length - 2];
        return answer;
    }
}