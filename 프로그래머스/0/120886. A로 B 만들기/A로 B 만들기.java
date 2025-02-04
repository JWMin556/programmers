class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        for (int i = 0; i < before.length(); i++) {
            char ch = before.charAt(i);
            if (after.contains(String.valueOf(ch))) {
                int index = after.indexOf(String.valueOf(ch));
                String front = after.substring(0, index);
                String back = after.substring(index + 1);
                after = front + back;
            }

            if (after.length() == 0) {
                answer = 1;
            }
        }
        return answer;
    }
}