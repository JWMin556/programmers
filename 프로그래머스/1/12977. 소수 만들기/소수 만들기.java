class Solution {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int z = j+1; z < nums.length; z++) {
                    int current = nums[i] + nums[j] + nums[z];
                    if (isPrime(current)) answer++;
                }
            }
        }
        return answer;
    }
}