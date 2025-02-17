class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String sub = t.substring(i, i + p.length());
            long subNumber = Long.parseLong(sub);
            if (subNumber <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}