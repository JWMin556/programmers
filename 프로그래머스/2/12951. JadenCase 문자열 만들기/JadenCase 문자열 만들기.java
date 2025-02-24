class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        boolean flag = false;  // 대문자로 바꿔야 하는지 아닌지에 대한 플래그
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i == 0){
                if (ch >= '0' &&  ch <= '9') {
                    builder.append(ch);
                } else {
                    ch = Character.toUpperCase(ch);
                    builder.append(ch);
                }
            } else {
                if (ch == ' ') {
                    builder.append(ch);
                    flag = true; // 띄어쓰기니까 그 다음녀석은 대문자로 시작해야 한다.
                } else {
                    if (flag) {
                        ch = Character.toUpperCase(ch);
                        builder.append(ch);
                        flag = false; // 다시 플래그를 내리기
                    } else {
                        ch = Character.toLowerCase(ch);
                        builder.append(ch);
                    }
                }
            }
        }
        answer = builder.toString();
        return answer;
    }
}