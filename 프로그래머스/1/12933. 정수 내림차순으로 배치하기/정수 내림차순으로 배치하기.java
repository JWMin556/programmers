import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> numbers = new ArrayList<>();
        while (n > 0) {
            numbers.add(n % 10);
            n /= 10;
        }
        long[] numbersArray = numbers.stream().mapToLong(Long::valueOf).toArray();
        numbersArray = Arrays.stream(numbersArray).sorted().toArray();
        int rounds = 1;
        for (int i = 0; i < numbersArray.length; i++) {
            answer += numbersArray[i] * rounds;
            rounds *= 10;
        }
        return answer;
    }
}