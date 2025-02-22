class Solution {
    public int solution(String s) {
        int answer = 0;
        String temp = "";
        while (s.length() > 0) {
            char c = s.charAt(0);
            if (Character.isDigit(c)) {
                temp += c;
                s = s.substring(1);
                continue;
            } else {
                if (c == 'z') {
                    temp += '0';
                    s = s.substring(4);
                    continue;
                } else if (c == 'o') {
                    temp += '1';
                    s = s.substring(3);
                    continue;
                } else if (c == 't') {
                    char c1 = s.charAt(1);
                    if (c1 == 'w') {
                        temp += '2';
                        s = s.substring(3);
                        continue;
                    } else if (c1 == 'h') {
                        temp += '3';
                        s = s.substring(5);
                        continue;
                    }
                } else if (c == 'f') {
                    char c1 = s.charAt(1);
                    if (c1 == 'o') {
                        temp += '4';
                        s = s.substring(4);
                        continue;
                    } else if (c1 == 'i') {
                        temp += '5';
                        s = s.substring(4);
                        continue;
                    }
                } else if (c == 's') {
                    char c1 = s.charAt(1);
                    if (c1 == 'i') {
                        temp += '6';
                        s = s.substring(3);
                        continue;
                    } else if (c1 == 'e') {
                        temp += '7';
                        s = s.substring(5);
                        continue;
                    }
                } else if (c == 'e') {
                    temp += '8';
                    s = s.substring(5);
                    continue;
                } else if (c == 'n') {
                    temp += '9';
                    s = s.substring(4);
                    continue;
                }
            }
        }
        answer = Integer.parseInt(temp);
        return answer;
    }
}