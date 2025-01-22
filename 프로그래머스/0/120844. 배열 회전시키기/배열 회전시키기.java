class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];
        if (direction.equals("right")) {
            for (int i = 1; i < answer.length; i++) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[answer.length - 1];
        } else if (direction.equals("left")) {
            for (int i = 0; i < answer.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        }
        return answer;
    }
}