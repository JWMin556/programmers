import java.util.*;

class Solution {
    static int answer;
    private static int dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int currentNode, int n) {
        int count = 1;
        visited[currentNode] = true;
        
        for (int nextNode : graph.get(currentNode)) {
            if (!visited[nextNode]) {
                count += dfs(graph, visited, nextNode, n);
            }
        }
        answer = Math.min(answer, Math.abs(n - 2*count));
        return count;
    }
    
    public int solution(int n, int[][] wires) {
        answer = n;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        boolean[] visited = new boolean[n+1];
        dfs(graph, visited, 1, n);
        return answer;
    }
}