import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}