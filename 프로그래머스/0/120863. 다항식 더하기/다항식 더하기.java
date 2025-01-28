class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int degreeNumber = 0;
        int number = 0;
        String[] polynomialArray = polynomial.split("\\s");
        for (int i = 0; i < polynomialArray.length; i += 2) {
            if (polynomialArray[i].contains("x")) {
                if (polynomialArray[i].equals("x")) {  // 만약 x + x 같이 계수가 1일 경우를 대비
                    degreeNumber += 1;
                } else {
                    String polynomialPart = polynomialArray[i].substring(0, polynomialArray[i].indexOf("x"));
                    degreeNumber += Integer.parseInt(polynomialPart);
                }
            } else {
                number += Integer.parseInt(polynomialArray[i]);
            }
        }
        if (degreeNumber == 0 && number != 0) {
            answer = String.valueOf(number);
        } else if (number == 0 && degreeNumber != 0) {
            if (degreeNumber == 1) {
                answer = "x";
            } else {
                answer = String.valueOf(degreeNumber) + "x";
            }
        } else if (degreeNumber != 0 && number != 0) {
            if (degreeNumber == 1) {
                answer = "x" + " + " + String.valueOf(number);
            } else {
                answer = String.valueOf(degreeNumber) + "x" + " + " + String.valueOf(number);
            }
        } else {
            answer = "0";
        }
        return answer;
    }
}