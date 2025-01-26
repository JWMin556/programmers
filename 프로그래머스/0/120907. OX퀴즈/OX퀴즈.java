class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] question = quiz[i].split("\\s");
            if (question[1].equals("+")) {
                answer[i] = (Integer.parseInt(question[0]) + Integer.parseInt(question[2]) == Integer.parseInt(question[4])) ? "O" : "X";
            } else if (question[1].equals("-")) {
                answer[i] = (Integer.parseInt(question[0]) - Integer.parseInt(question[2]) == Integer.parseInt(question[4])) ? "O" : "X";
            }
        }
        return answer;
    }
}