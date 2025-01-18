class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer = new int[n][n];
        int number = 1;
        if (n % 2 != 0) { answer[(int)(n/2)][(int)(n/2)] = n * n; }
        for (int i = 0; i < n; i++) {
            int j = i;
            while(j < n - i) {
                answer[i][j] = number;
                number++;
                j++;
            }

            int k = j - 1;
            int l = i + 1;
            while (l < n - i) {
                answer[l][k] = number;
                number++;
                l++;
            }

            l -= 2;
            while (l >= i) {
                answer[k][l] = number;
                number++;
                l--;
            }

            k -= 1;
            while (k > i) {
                answer[k][i] = number;
                number++;
                k--;
            }

            if (number >= n*n) { break; }

        }
        return answer;
    }
}