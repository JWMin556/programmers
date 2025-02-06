class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        answer = new int[num];
        int number = 0;
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = number;
            number--;
        }
        int originalIndex = 1;  // 실제 answer배열에 들어가기 위한 숫자
        if (total == 0) {
            int sum = 0;
            for (int i = answer.length - 1; i >= 0; i--) {
                sum += answer[i];
            }
            while (sum != total) {
                int index = originalIndex;
                for (int i = answer.length - 1; i >= 0; i--) {
                    answer[i] = index;
                    index--;
                }

                sum = 0;
                for (int i = 0; i < answer.length; i++) {
                    sum += answer[i];
                }

                if (sum == total) { break; }

                originalIndex++;
            }
        } else {
            while (originalIndex <= total) {
                int index = originalIndex;
                for (int i = answer.length - 1; i >= 0; i--) {
                    answer[i] = index;
                    index--;
                }

                int sum = 0;
                for (int i = 0; i < answer.length; i++) {
                    sum += answer[i];
                }

                if (sum == total) { break; }

                originalIndex++;
            }
        }
        return answer;
    }
}