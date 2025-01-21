class Solution {
    public static char numToChar(int num) {
        if (num == 0) { return 'a'; }
        else if (num == 1) { return 'b'; }
        else if (num == 2) { return 'c'; }
        else if (num == 3) { return 'd'; }
        else if (num == 4) { return 'e'; }
        else if (num == 5) { return 'f'; }
        else if (num == 6) { return 'g'; }
        else if (num == 7) { return 'h'; }
        else if (num == 8) { return 'i'; }
        else if (num == 9) { return 'j'; }
        return 0;
    }
    
    public String solution(int age) {
        String answer = "";
        if (age < 10) {
            answer += numToChar(age);
        } else if (age >= 10 && age < 100) {
            int num = age / 10;
            int remainder = age % 10;
            answer += numToChar(num);
            answer += numToChar(remainder);
        } else if (age >= 100 && age < 1000) {
            int numHun = age / 100;
            answer += numToChar(numHun);
            int remainder_ten = age % 100;
            int numTen = remainder_ten / 10;
            answer += numToChar(numTen);
            answer += numToChar(remainder_ten % 10);
        } else if (age == 1000) {
            answer = "baaa";
        }
        return answer;
    }
}