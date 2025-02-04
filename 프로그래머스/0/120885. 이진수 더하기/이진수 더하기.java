class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int bin1Length = bin1.length();
        int bin2Length = bin2.length();
        int round = 0;  // 올림수
        if (bin1Length == bin2Length) {
            for(int i = bin1Length - 1; i >= 0; i--) {
                int bin1Char = bin1.charAt(i) - '0';
                int bin2Char = bin2.charAt(i) - '0';
                int sum = bin1Char + bin2Char + round;
                if (sum >= 2) {
                    sum -= 2;
                    answer = Integer.toString(sum) + answer;
                    round = 1;
                } else {
                    answer = Integer.toString(sum) + answer;
                    round = 0;
                }

                if (i == 0 && round != 0) {
                    answer = (char) (round + '0') + answer;
                }
            }
        } else if (bin1Length > bin2Length) {
            for(int i = bin2Length - 1; i >= 0; i--) {
                int bin2Char = bin2.charAt(i) - '0';
                int bin1Index = i + bin1Length - bin2Length;
                int bin1Char = bin1.charAt(bin1Index) - '0';
                int sum = bin1Char + bin2Char + round;

                if (sum >= 2) {
                    sum -= 2;
                    answer = Integer.toString(sum) + answer;
                    round = 1;
                } else {
                    answer = Integer.toString(sum) + answer;
                    round = 0;
                }

                if (i == 0) {
                    if (round == 0) {
                        answer = bin1.substring(0, bin1Index) + answer;  // 그냥 나머지 부분 가져다 붙이기
                    } else {
                        for (int j = bin1Index - 1; j >= 0; j--) {
                            bin1Char = bin1.charAt(j) - '0';
                            sum = bin1Char + round;
                            if (sum >= 2) {
                                sum -= 2;
                                answer = Integer.toString(sum) + answer;
                                round = 1;
                            } else {
                                answer = Integer.toString(sum) + answer;
                                round = 0;
                            }

                            if (j == 0 && round != 0) {
                                answer = (char) (round + '0') + answer;
                            }
                        }
                    }
                }
            }
        } else if (bin1Length < bin2Length) {
            for(int i = bin1Length - 1; i >= 0; i--) {
                int bin1Char = bin1.charAt(i) - '0';
                int bin2Index = i + bin2Length - bin1Length;
                int bin2Char = bin2.charAt(bin2Index) - '0';
                int sum = bin1Char + bin2Char + round;

                if (sum >= 2) {
                    sum -= 2;
                    answer = Integer.toString(sum) + answer;
                    round = 1;
                } else {
                    answer = Integer.toString(sum) + answer;
                    round = 0;
                }

                if (i == 0) {
                    if (round == 0) {
                        answer = bin2.substring(0, bin2Index) + answer;  // 그냥 나머지 부분 가져다 붙이기
                    } else {
                        for (int j = bin2Index - 1; j >= 0; j--) {
                            bin2Char = bin2.charAt(j) - '0';
                            sum = bin2Char + round;
                            if (sum >= 2) {
                                sum -= 2;
                                answer = Integer.toString(sum) + answer;
                                round = 1;
                            } else {
                                answer = Integer.toString(sum) + answer;
                                round = 0;
                            }

                            if (j == 0 && round != 0) {
                                answer = (char) (round + '0') + answer;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}