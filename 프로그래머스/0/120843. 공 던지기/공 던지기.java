class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        int index = 0;
        while (count < k) {
            answer = numbers[index];
            count++;
            index+=2;
            if (index > numbers.length - 1) {
                index = index - numbers.length;
            }
        }
        return answer;
    }
}