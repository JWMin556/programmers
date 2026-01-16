import java.util.*;

class Solution {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int solution(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            int gcdNumber = gcd(arr[i], arr[i - 1]);
            int lcmNumber = (arr[i] * arr[i - 1]) / gcdNumber;
            arr[i - 1] = lcmNumber;
        }
        
        int answer = arr[0];
        return answer;
    }
}