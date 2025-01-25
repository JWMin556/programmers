class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String temp = "";
        int i = 0;
        int numbersLength = numbers.length();
        while (numbersLength > 0) {
            Character c = numbers.charAt(i);
            if (c.equals('o')) {
                temp += '1';
                numbersLength -= 3;
                i += 3;
            } else if (c.equals('t')) {
                i += 1;
                Character c2 = numbers.charAt(i);
                if (c2.equals('w')) {
                    temp += '2';
                    numbersLength -= 3;
                    i += 2;
                } else if (c2.equals('h')) {
                    temp += '3';
                    numbersLength -= 5;
                    i += 4;
                }
            } else if (c.equals('f')) {
                i += 1;
                Character c2 = numbers.charAt(i);
                if (c2.equals('o')) {
                    temp += '4';
                    numbersLength -= 4;
                    i += 3;
                } else if (c2.equals('i')) {
                    temp += '5';
                    numbersLength -= 4;
                    i += 3;
                }
            } else if (c.equals('s')) {
                i += 1;
                Character c2 = numbers.charAt(i);
                if (c2.equals('i')) {
                    temp += '6';
                    numbersLength -= 3;
                    i += 2;
                } else if (c2.equals('e')) {
                    temp += '7';
                    numbersLength -= 5;
                    i += 4;
                }
            } else if (c.equals('e')) {
                temp += '8';
                numbersLength -= 5;
                i += 5;
            } else if (c.equals('n')) {
                temp += '9';
                numbersLength -= 4;
                i += 4;
            } else if (c.equals('z')) {
                temp += '0';
                numbersLength -= 4;
                i += 4;
            } else {
                try {
                    throw new Exception("불가능한 글자임");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}