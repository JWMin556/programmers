import java.util.*;

class Solution {
    static int answer;
    
    public static int dfs(Map<Integer, List<Integer>> tree, boolean[] visited, int cur, int n) {
        int count = 1;
        visited[cur] = true;
        
        for (int next: tree.get(cur)) {
            if (!visited[next]) {
                count += dfs(tree, visited, next, n);
            }
        }
        
        answer = Math.min(answer, Math.abs(n - count * 2));
        return count;
    }
    
    public int solution(int n, int[][] wires) {
        answer = n;
        
        // 먼저 일반적인 방식으로 그래프를 생성한다. 
        Map<Integer, List<Integer>> tree = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            tree.put(i, new ArrayList<>());
        }
        
        for (int[] wire : wires) {
            tree.get(wire[0]).add(wire[1]);
            tree.get(wire[1]).add(wire[0]);
        }
        
        // dfs를 통해 특정 
        boolean[] visited = new boolean[n+1];
        dfs(tree, visited, 1, n);
        
        return answer;
    }
}