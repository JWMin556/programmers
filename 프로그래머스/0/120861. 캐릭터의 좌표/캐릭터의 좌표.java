class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        answer = new int[2];
        int maxRight = board[0] / 2;
        int maxLeft = -(board[0] / 2);
        int maxUp = board[1] / 2;
        int maxDown = -(board[1] / 2);
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                int move = answer[0] - 1;
                if (move >= maxLeft && move <= maxRight) {
                    answer[0] = move;
                }
            } else if (keyinput[i].equals("right")) {
                int move = answer[0] + 1;
                if (move >= maxLeft && move <= maxRight) {
                    answer[0] = move;
                }
            } else if (keyinput[i].equals("up")) {
                int move = answer[1] + 1;
                if (move >= maxDown && move <= maxUp) {
                    answer[1] = move;
                }
            } else if (keyinput[i].equals("down")) {
                int move = answer[1] - 1;
                if (move >= maxDown && move <= maxUp) {
                    answer[1] = move;
                }
            }
        }
        return answer;
    }
}