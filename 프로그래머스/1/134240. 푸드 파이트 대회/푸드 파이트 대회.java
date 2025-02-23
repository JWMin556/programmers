class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 0) {
                num = food[i] / 2;
            } else {
                if (food[i] >= 3) {
                    num = (food[i] - 1) / 2;
                }
            }
            while (num > 0) {
                sb.append(i);
                num--;
            }
        }
        answer = sb.toString() + '0' + sb.reverse().toString();
        return answer;
    }
}