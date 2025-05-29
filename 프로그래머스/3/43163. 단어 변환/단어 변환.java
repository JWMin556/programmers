import java.util.*;

class Solution {
    static Map<String, List<String>> graph = new HashMap<>();
    
    //먼저 두 노드가 연결될 수 있는 지 판단한다
    public static boolean isDifferenceOne(String node1, String node2) {
        int count = 0;
        for (int i = 0; i < node1.length(); i++) {
            if (node1.charAt(i) == node2.charAt(i)) {
                count++;
            }
        }
        int differeceOne = node1.length() - count;  // 전체길이에서 같은 녀석들의 개수를 뺀다. 그놈이 1이면 정답임
        return differeceOne == 1;
    }
    
    // 그래프 그리기 
    public static void makeGraph(String begin, String[] words) {
        String[] wordsArr = new String[words.length + 1];
        wordsArr[0] = begin;
        for (int i = 0; i < words.length; i++) {
            wordsArr[i + 1] = words[i];
        }
        
        for (int i = 0; i < wordsArr.length; i++) {
            List<String> list = new ArrayList<>();
            String key = wordsArr[i];
            for (int j = 0; j < wordsArr.length; j++) {
                String value = wordsArr[j];
                if (key != value) {
                    if (isDifferenceOne(key, value)) {
                        list.add(value);
                    }
                } 
            }
            graph.put(key, list);
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        makeGraph(begin, words);
        
        Queue<String> queue = new ArrayDeque<>();
        Map<String, Integer> distanceWithVisited = new HashMap<>();
        distanceWithVisited.put(begin, 0);
        for (int i = 0; i < words.length; i++) {
            distanceWithVisited.put(words[i], 0);
        }
        distanceWithVisited.put(target, 0);  // 목표지점도 넣어주는 것 잊지 말기
        
        // begin을 넣어서 시작한다. distanceWithVisited는 이미 0이있기에 문제없다.
        queue.add(begin);
        
        while(!queue.isEmpty()) {
            String currentNode = queue.poll();
            System.out.println("현재노드: " + currentNode);
            if (currentNode.equals(target)) {
                answer = distanceWithVisited.get(currentNode);
                break;
            }
            
            for (String nextNode : graph.get(currentNode)) {
                System.out.println("자식노드: " + nextNode);
                // 아직 방문을 안했으면
                if (distanceWithVisited.get(nextNode) == 0) {
                    queue.add(nextNode);
                    distanceWithVisited.put(nextNode, distanceWithVisited.get(currentNode) + 1);
                }
            }
        }
        return answer;
    }
}