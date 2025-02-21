import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        int[] temp = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(temp);

        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.add(temp[0]);
        boolean flag = false;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == temp[i-1]) {
                flag = true;
            } else {
                flag = false;
            }

            if (!flag) {
                tempList.add(temp[i]);
            }
        }
        answer = tempList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}