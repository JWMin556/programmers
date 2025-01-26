class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] my_word = my_string.split("\\s");
        boolean plus = false;
        answer = Integer.valueOf(my_word[0]);
        for (int i = 1; i < my_word.length; i++) {
            if (my_word[i].equals("+")) { plus = true; }
            else if (my_word[i].equals("-")) { plus = false; }

            if (i % 2 == 0) { // 즉, 숫자들이 있는 공간
                if (plus) {
                    answer += Integer.parseInt(my_word[i]);
                } else {
                    answer -= Integer.parseInt(my_word[i]);
                }
            }
        }
        return answer;
    }
}