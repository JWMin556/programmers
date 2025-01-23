class Solution {
    public static boolean isCompositeNumber(int n) {
        boolean isTrue = false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { count++; }
            if (count >= 3) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }
    
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i >= 1; i--) {
            if (isCompositeNumber(i)) { answer++; }
        }
        return answer;
    }
}