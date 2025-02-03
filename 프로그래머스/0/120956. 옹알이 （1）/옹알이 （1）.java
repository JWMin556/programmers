class Solution {
    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            String b = babbling[i];
            boolean found = false;
            while (b.length() > countCharacter(b, '-')) {
                if (b.contains("aya")) {
                    int startindex = b.indexOf("aya");
                    int endindex = startindex + "aya".length();
                    String front = b.substring(0, startindex);
                    String back = b.substring(endindex);
                    b = front + "---" +back;
                    found = true;
                } else if (b.contains("ye")) {
                    int startindex = b.indexOf("ye");
                    int endindex = startindex + "ye".length();
                    String front = b.substring(0, startindex);
                    String back = b.substring(endindex);
                    b = front + "--" +back;
                    found = true;
                } else if (b.contains("woo")) {
                    int startindex = b.indexOf("woo");
                    int endindex = startindex + "woo".length();
                    String front = b.substring(0, startindex);
                    String back = b.substring(endindex);
                    b = front + "---" +back;
                    found = true;
                } else if (b.contains("ma")) {
                    int startindex = b.indexOf("ma");
                    int endindex = startindex + "ma".length();
                    String front = b.substring(0, startindex);
                    String back = b.substring(endindex);
                    b = front + "--" +back;
                    found = true;
                }
                else {
                    found = false;
                    break;
                }
            }

            if (found) {
                answer++;
            }

        }
        return answer;
    }
}