class Solution {
    public static int gcd(int a, int b) { // 두 수의 최대공약수 구하기
        if (a > b) {
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            return a;
        } else {
            while (a != 0) {
                int remainder = b % a;
                b = a;
                a = remainder;
            }
            return b;
        }
    }

    public static int lcm(int a, int b) { // 두 수의 최소공배수 구하기
        return a * b / gcd(a, b);
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];
        answer[1] = lcm(denom1, denom2);
        int numer1_lcm = answer[1] / denom1;
        int numer2_lcm = answer[1] / denom2;
        answer[0] = numer1 * numer1_lcm + numer2 * numer2_lcm;
        if (gcd(answer[0], answer[1]) > 0) { // 즉, 기약분수가 아니라면
            int gcd_num = gcd(answer[0], answer[1]);
            answer[0] = answer[0] / gcd_num;
            answer[1] = answer[1] / gcd_num;
        }
        return answer;
    }
}