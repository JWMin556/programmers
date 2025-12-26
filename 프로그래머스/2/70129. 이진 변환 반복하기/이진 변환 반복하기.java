class Solution {
    static int countOfZero = 0;
    
    private static String firstMethod(String s) {
        String result = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                result += arr[i];
            } else {
                countOfZero++;
            }
        }
        return result;
    }
    
    private static String secondMethod(String s) {
        String result = "";
        int count = s.length();
        while (count > 0) {
            result += (count % 2);
            count /= 2;
        }
        
        String reverse = "";
        for (int i = result.length() - 1; i >= 0; i--) {
            reverse += result.charAt(i);
        }
        
        return reverse;
    }
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        int totalTimes = 0;
        
        while (!s.equals("1")) {
            totalTimes++;
            s = firstMethod(s);
            s = secondMethod(s);
        }
        answer[0] = totalTimes;
        answer[1] = countOfZero;
        return answer;
    }
}