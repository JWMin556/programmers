class Solution {
    public long solution(long n) {
        long answer = 0;
        long index = -1;
        for (int i = 1; i <= n; i++) {
            if (Math.pow(i, 2) == n) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            answer = (long) Math.pow(index + 1, 2);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}