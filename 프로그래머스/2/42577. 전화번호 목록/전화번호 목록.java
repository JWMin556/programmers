import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < phone_book.length; i++) {
            hashMap.put(phone_book[i], i);
        }
        
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                String prefix = phone_book[i].substring(0, j);
                if (hashMap.containsKey(prefix)) return false;
            }
        }
        
        return true;
    }
}