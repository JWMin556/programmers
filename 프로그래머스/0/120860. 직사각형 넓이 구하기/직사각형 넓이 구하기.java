import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] widths = new int[dots.length];
        int[] heights = new int[dots.length];
        for (int i = 0; i < dots.length; i++) {
            widths[i] = dots[i][0];
            heights[i] = dots[i][1];
        }
        Arrays.sort(widths);
        Arrays.sort(heights);
        int width = widths[widths.length - 1] - widths[0];
        int height = heights[heights.length - 1] - heights[0];
        answer = width * height;
        return answer;
    }
}