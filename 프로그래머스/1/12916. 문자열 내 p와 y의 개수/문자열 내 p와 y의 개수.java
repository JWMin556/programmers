class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p' || ch == 'P') { countP++; }
            else if (ch == 'y' || ch == 'Y') { countY++; }
        }
        if (countP == countY) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}