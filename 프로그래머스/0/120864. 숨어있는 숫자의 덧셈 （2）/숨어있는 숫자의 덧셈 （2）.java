class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int i = 0;
        while (i < my_string.length()) {
            if (Character.isDigit(my_string.charAt(i))) {
                int index = i + 1; //숫자일 때 뒤에 이어서 숫자가 오는지 확인해야 함
                while(index < my_string.length() && Character.isDigit(my_string.charAt(index))) {
                    index++;
                }
                answer += Integer.parseInt(my_string.substring(i, index));  // i~index까지의 string만을 뽑아서 Int로 변환 후 반환
                i = index;
            } else {
                i++;
            }
        }
        return answer;
    }
}