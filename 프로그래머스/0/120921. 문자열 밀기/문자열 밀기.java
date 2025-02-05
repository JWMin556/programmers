class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if (!A.equals(B)) {
            int index = 1;
            while (A.length() > index) {
                char lastOfA = A.charAt(A.length() - 1);
                A = lastOfA + A.substring(0, A.length() - 1);
                if (A.equals(B)) {
                    answer = index;
                    break;
                } else {
                    answer = -1;
                }
                index++;
            }
        }
        return answer;
    }
}