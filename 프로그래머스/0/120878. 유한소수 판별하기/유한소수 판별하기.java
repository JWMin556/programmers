import java.util.HashSet;

class Solution {
    // 분수가 약분가능하면 약분가능한 정수를 반환하고 그게 아니면 그냥 1을 반환하는 함수
    public static int isAbbreviation(int a, int b) {
        int abbreviation = 1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                abbreviation *= i;
                a /= i;
                b /= i;
            }
        }
        return abbreviation;
    }

    // 분모의 소인수가 2, 5 둘 중 하나만 존재하는지 판단하는 함수
    public static boolean isPrimeFactorsTwoFive(int x) {
        int index = 2;
        HashSet<Integer> primeFactors = new HashSet<>();
        while (x > 1) {
            if (x % index == 0) {
                x /= index;
                primeFactors.add(index);
            } else {
                index++;
            }
        }
        boolean isTwoFive = true;
        for (Integer primeFactor : primeFactors) {
            if (primeFactor == 2 || primeFactor == 5) {
                isTwoFive = true;
            } else {
                isTwoFive = false;
                break;
            }
        }
        return isTwoFive;
    }
    
    public int solution(int a, int b) {
        int answer = 0;
        int abbreviation = isAbbreviation(a, b);
        b /= abbreviation;  // 어차피 분모만 이용하면 되므로 분모만 기약분수의 분모로 바꾼다.
        answer = isPrimeFactorsTwoFive(b) ? 1 : 2;
        return answer;
    }
}