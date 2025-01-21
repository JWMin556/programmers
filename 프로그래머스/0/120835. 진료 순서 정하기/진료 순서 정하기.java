import java.util.*;

class Solution {
    // 해당 배열에서의 자신의 등수를 구하는 함수
    public static int isRank (int [] arr, int yourNumber) {
        int yourRank = 0;
        int[] rank = Arrays.stream(arr)
                .boxed() // int를 Integer로 변환
                .sorted(Comparator.reverseOrder()) //역순 정렬
                .mapToInt(Integer::intValue) // 다시 Interger -> int로
                .toArray();
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == yourNumber) {
                yourRank = i+1;
                break;
            }
        }
        return yourRank;
    }
    
    public int[] solution(int[] emergency) {
        int[] answer = {};
        answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = isRank(emergency, emergency[i]);
        }
        return answer;
    }
}