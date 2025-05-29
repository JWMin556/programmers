import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        int[] rowDirection = {0, 1, 0, -1};
        int[] colDirection = {1, 0, -1, 0};
        
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m]; 
        
        //[0][0]에서 시작하며 거리는 1이다.
        queue.add(new int[] {0, 0, 1});
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];
            
            if (row == n-1 && col == m-1) {
                answer = distance;
                break;
            }
            
            for (int i = 0; i < 4; i++) {
                int nextRow = row + rowDirection[i];
                int nextCol = col + colDirection[i];
                
                // 유효범위인지 파악
                if ((nextRow >= 0 && nextRow <= n-1) &&
                    (nextCol >= 0 && nextCol <= m-1)) {
                    
                    // 1로 되어있는지 확인
                    if (maps[nextRow][nextCol] == 1) {
                        
                        // 방문을 안했으면
                        if (!visited[nextRow][nextCol]) {
                            queue.add(new int[] {nextRow, nextCol, distance + 1});
                            visited[nextRow][nextCol] = true;
                        }
                    }
                }
            }
            
        }
        
        
        
        
        return answer;
    }
}