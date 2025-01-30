class Solution {
    public static boolean isParallel(int[][] first, int[][] second) {
        double inclinationFirst = (double) (first[1][1] - first[0][1]) / (first[1][0] - first[0][0]);
        double inclinationSecond = (double) (second[1][1] - second[0][1]) / (second[1][0] - second[0][0]);
        return inclinationFirst == inclinationSecond;
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        int[][] first1 = new int[][]{dots[0], dots[1]};
        int[][] second1 = new int[][]{dots[2], dots[3]};
        int case1Answer = isParallel(first1, second1) ? 1 : 0;

        int[][] first2 = new int[][]{dots[0], dots[2]};
        int[][] second2 = new int[][]{dots[1], dots[3]};
        int case2Answer = isParallel(first2, second2) ? 1 : 0;

        int[][] first3 = new int[][]{dots[0], dots[3]};
        int[][] second3 = new int[][]{dots[1], dots[2]};
        int case3Answer = isParallel(first3, second3) ? 1 : 0;

        if (case1Answer == 1 || case2Answer == 1 || case3Answer == 1) { answer = 1; }
        else { answer = 0; }
        return answer;
    }
}