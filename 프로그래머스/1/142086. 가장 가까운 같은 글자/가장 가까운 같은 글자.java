class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                answer[0] = -1;
            } else {
                int count = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (s.charAt(j) == s.charAt(i)) {
                        answer[i] = count;
                        break;
                    } else {
                        count++;
                        answer[i] = -1;
                    }
                }
            }
        }
        return answer;
    }
}