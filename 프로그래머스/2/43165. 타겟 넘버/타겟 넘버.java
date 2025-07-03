class Solution {
    static int answer = 0;
    
    public static void makeTargetNumbers(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (target == sum) answer++;
            return;
        }
        
        makeTargetNumbers(numbers, target, depth+1, sum+numbers[depth]);
        makeTargetNumbers(numbers, target, depth+1, sum-numbers[depth]);
    }
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        makeTargetNumbers(numbers, target, 0, 0);
        return answer;
    }
}