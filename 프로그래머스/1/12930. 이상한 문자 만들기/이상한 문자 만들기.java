import java.util.ArrayList;

class Solution {
    public static String[] stringToArray(String input) {
        ArrayList<String> list = new ArrayList<String>();
        String word = "";
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            String s = input.substring(i, i + 1);
            if (s.equals(" ")) {
                if (flag && !word.equals("")) {
                    list.add(word);
                }
                flag = false;
                list.add(s);
                word = "";
            } else {
                flag = true;
                word += s;
            }
            if (i == input.length() - 1 && flag) {
                list.add(word);
            }
        }
        String[] array = list.toArray(new String[list.size()]);
        return array;
    }
    
    public String solution(String s) {
        String answer = "";
        String[] words = stringToArray(s);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (j % 2 == 0) {
                    ch = Character.toUpperCase(ch);
                } else {
                    ch = Character.toLowerCase(ch);
                }
                word = word.substring(0, j) + ch + word.substring(j + 1);
            }
            answer += word;
        }
        return answer;
    }
}