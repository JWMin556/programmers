class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                if (array[i] == 7) {
                    answer++;
                }
            } else {
                int temp = array[i];
                while (temp > 0) {
                    int number = temp % 10;
                    if (number == 7) { answer++; }
                    temp = temp / 10;
                }
            }
        }
        return answer;
    }
}