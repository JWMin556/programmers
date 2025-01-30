class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i = 0; i < dic.length; i++) {
            String word = dic[i];
            int count = 0;
            for (int j = 0; j < spell.length; j++) {
                if (word.contains(spell[j])) {
                    count++;
                    if (count == spell.length) {
                        answer = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return answer;
    }
}