import java.util.*;

class Solution {
    static class Edge implements Comparable<Edge> {
        int node, cost;
        public Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
        
        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
    
    public static int[] dj(Map<Integer, List<Edge>> graph, int n, int start) {
        int INF = Integer.MAX_VALUE;
        int[] distance = new int[n+1];
        Arrays.fill(distance, INF);
        
        Queue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));
        distance[start] = 0;
        
        while(!pq.isEmpty()) {
            Edge current = pq.poll();
            if (distance[current.node] < current.cost) continue;
            
            List<Edge> neighbors = graph.get(current.node);
            if (neighbors == null) continue;
            
            for (Edge next : neighbors) {
                int nextCost = current.cost + next.cost;
                if (distance[next.node] > nextCost) {
                    distance[next.node] = nextCost;
                    pq.add(new Edge(next.node, nextCost));
                }
            }
        }
        return distance;
    }
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        // 먼저 그래프를 만들고 초기화
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int[] fare: fares) {
            int u = fare[0], v = fare[1], w = fare[2];
            graph.computeIfAbsent(u, x -> new ArrayList<>()).add(new Edge(v, w));
            graph.computeIfAbsent(v, x -> new ArrayList<>()).add(new Edge(u, w));
        }
        
        // 각 점에 대해서 다익스트라 진행
        int[] dist_s = dj(graph, n, s);
        int[] dist_a = dj(graph, n, a);
        int[] dist_b = dj(graph, n, b);
        
        int answer = Integer.MAX_VALUE;
        // for(int i = 1부터 n까지) 만들어놓은 dist_a[i] != Integer.MAX_VALUE 비교하기
        for (int i = 1; i <= n; i++) {
            if (dist_s[i] != Integer.MAX_VALUE && dist_a[i] != Integer.MAX_VALUE && dist_b[i] != Integer.MAX_VALUE) {
                answer = Math.min(answer, dist_s[i] + dist_a[i] + dist_b[i]);
            }
        }
        return answer;
    }
}