import java.util.*;

class Solution {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static void makeNumberSets(char[] chars, String current, boolean[] visited, int count, Set<Integer> setNums) {
        if (current.length() == count) { 
            setNums.add(Integer.parseInt(current)); 
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                makeNumberSets(chars, current + chars[i], visited, count, setNums);
                visited[i] = false;
            }
        }
    }
    
    public int solution(String numbers) {
        Set<Integer> setNums = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        
        for (int r = 1; r <= numbers.length(); r++) {
            makeNumberSets(numbers.toCharArray(), "", visited, r, setNums);
        }
        
        int answer = 0;
        for (int num : setNums) {
            if (isPrime(num)) answer++;
        }
        return answer;
    }
}