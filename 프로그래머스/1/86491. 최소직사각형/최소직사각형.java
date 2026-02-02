import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int sizesLength = sizes.length;
        int[] width_arr = new int[sizesLength];
        int[] height_arr = new int[sizesLength];
        
        for (int i = 0; i < sizesLength; i++ ) {
            Arrays.sort(sizes[i]);
        }
        
        for (int i = 0; i < sizesLength; i++) {
            width_arr[i] = sizes[i][0];
            height_arr[i] = sizes[i][1];
        }
        
        Arrays.sort(width_arr);
        Arrays.sort(height_arr);
        
        answer = width_arr[sizesLength - 1] * height_arr[sizesLength - 1];
        
        return answer;
    }
}