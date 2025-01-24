class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] words = s.split("\\s");
        answer = Integer.parseInt(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals("Z")) {
                answer -= Integer.parseInt(words[i - 1]);
            } else {
                answer += Integer.parseInt(words[i]);
            }
        }
        return answer;
    }
}