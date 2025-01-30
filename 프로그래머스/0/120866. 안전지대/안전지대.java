class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int rows = board.length;
        int cols = board[0].length;
        int[][] temp = new int[rows][cols]; // 중복 유무를 확인하기 위한 행렬

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    if (i - 1 >= 0 && i - 1 < rows && j - 1 >= 0 && j - 1 < cols) { temp[i - 1][j - 1]++; }
                    if (i - 1 >= 0 && i - 1 < rows && j >= 0 && j < cols) { temp[i - 1][j]++; }
                    if (i - 1 >= 0 && i - 1 < rows && j + 1 >= 0 && j + 1 < cols) { temp[i - 1][j + 1]++; }
                    if (i >= 0 && i < rows && j - 1 >= 0 && j - 1 < cols) { temp[i][j - 1]++; }
                    if (i >= 0 && i < rows && j >= 0 && j < cols) { temp[i][j]++; }
                    if (i >= 0 && i < rows && j + 1 >= 0 && j + 1 < cols) { temp[i][j + 1]++; }
                    if (i + 1 >= 0 && i + 1 < rows && j - 1 >= 0 && j - 1 < cols) { temp[i + 1][j - 1]++; }
                    if (i + 1 >= 0 && i + 1 < rows && j >= 0 && j < cols) { temp[i + 1][j]++; }
                    if (i + 1 >= 0 && i + 1 < rows && j + 1 >= 0 && j + 1 < cols) { temp[i + 1][j + 1]++; }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (temp[i][j] == 0) { // 이렇게 최종적으로 0으로만 된 경우가 지뢰랑 상관없는 경우
                    answer++;
                }
            }
        }
        
        return answer;
    }
}