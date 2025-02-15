import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (boolean prime : isPrime) {
            if (prime) {
                answer++;
            }
        }
        return answer;
    }
}