import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int number = n;
        ArrayList<Integer> list = new ArrayList<>();
        int index = 2;
        boolean flag = false;  // index가 이전과 같은지 다른지를 의미하는 플래그
        while (true) {
            if (number % index == 0) {
                if (!flag) {
                    list.add(index);
                }
                number /= index;
                flag = true;  // index가 이전과 똑같음을 나타냄
            } else {
                index++;
                flag = false; // index가 이전과 달라졌음을 나타냄
            }

            if (index > number) { break; }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}