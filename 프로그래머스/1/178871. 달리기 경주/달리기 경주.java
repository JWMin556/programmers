import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        // 선수 이름을 키로, 현재 순위를 값으로 저장하는 HashMap
        HashMap<String, Integer> playerRanks = new HashMap<>();

        // 초기 순위 정보 셋팅
        for (int i = 0; i < players.length; i++) {
            playerRanks.put(players[i], i);
        }

        // 순위 조정
        for (String called : callings) {
            int currentRank = playerRanks.get(called); //현재 순위
            if (currentRank > 0) {  // 1등은 호출되지 않으므로 확인 불필요함
                //추월 대상 선수의 이름과 순위
                String overtaken = players[currentRank - 1];

                // 순위 변경
                players[currentRank] = overtaken;
                players[currentRank - 1] = called;

                // Hash map 갱신
                playerRanks.put(called, currentRank - 1);
                playerRanks.put(overtaken, currentRank);
            }
        }

        answer = players.clone();
        
        return answer;
    }
}