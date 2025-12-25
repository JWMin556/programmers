class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n];
        
        num[0] = 0;
        num[1] = 1;
        
        for (int i = 2; i < num.length; i++) {
            num[i] = num[i - 1] % 1234567 + num[i - 2]% 1234567;
        }
        
        answer = (num[n-1]+num[n-2])%1234567;
        return answer;
    }
}