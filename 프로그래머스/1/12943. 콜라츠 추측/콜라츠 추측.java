class Solution {
    public int solution(int num) {
        int answer = 0;
        if (num == 1) {
            answer = 0;
        } else {
            Long number = Long.valueOf(num);
            while (answer <= 500) {
                answer++;

                if (answer >= 500 && number != 1) {
                    answer = -1;
                    break;
                }


                if (number % 2 == 0) { number /= 2; }
                else { number = (3 * number) + 1; }

                if (number == 1) { break; }
            }
        }
        return answer;
    }
}