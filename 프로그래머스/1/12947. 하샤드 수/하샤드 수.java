import java.util.ArrayList;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tempX = x;
        ArrayList<Integer> list = new ArrayList<>();
        while(tempX > 0) {
            int number = (int) (tempX % 10);
            list.add(number);
            tempX /= 10;
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}