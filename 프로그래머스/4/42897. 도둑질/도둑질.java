class Solution {
    public int solution(int[] money) {
        int answer = 0;
        if (money.length == 0) return 0;
        if (money.length == 1) return money[0];
        if (money.length == 2) return Math.max(money[0], money[1]);
        
        // 경우 1: 첫 번째 집을 포함하는 경우 (마지막 집은 제외)
        int[] dp1 = new int[money.length];
        dp1[0] = money[0];
        dp1[1] = Math.max(money[0], money[1]);
        
        for (int i = 2; i < money.length - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + money[i]);
        }
        
        // 경우 2: 첫 번째 집을 포함하지 않는 경우 (마지막 집 포함 가능)
        int[] dp2 = new int[money.length];
        dp2[0] = 0;  // 첫 번째 집을 포함X
        dp2[1] = money[1];
        
        for (int i = 2; i < money.length; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + money[i]);
        }
        
        // 두 경우 중 최댓값을 반환한다. 
        answer = Math.max(dp1[money.length - 2], dp2[money.length - 1]);
        return answer;
    }
}