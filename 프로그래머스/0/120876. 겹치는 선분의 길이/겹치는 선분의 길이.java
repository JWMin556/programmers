import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    // 두 선분의 겹친 부분을 반환해주는 함수
    public static int[] overlapLines(int[] a, int[] b) {
        int[] answerArray = {};
        ArrayList<Integer> list = new ArrayList<>();
        if (a[0] <= b[0] && b[1] <= a[1]) { // b가 a에 포함된 형태
            for (int i = b[0]; i <= b[1]; i++) {
                list.add(i);
            }
        } else if (b[0] <= a[0] && a[1] <= b[1]) {  // a가 b에 포함된 형태
            for (int i = a[0]; i <= a[1]; i++) {
                list.add(i);
            }
        } else if (a[0] <= b[0] && b[0] <= a[1] && a[1] <= b[1]) {  // -----a-----b------인 상황
            for (int i = b[0]; i <= a[1]; i++) {
                list.add(i);
            }
        } else if (b[0] <= a[0] && a[0] <= b[1] && b[1] <= a[1]) {  // ------b-----a------인 상황
            for (int i = a[0]; i <= b[1]; i++) {
                list.add(i);
            }
        }
        answerArray = list.stream().mapToInt(i -> i).toArray();
        if (answerArray.length == 1) { // 하나짜리는 필요없음
            answerArray = new int[]{};
        }
        return answerArray;
    }

    // 두 선분이 겹쳤는지를 확인해주는 함수
    public static boolean isOverlap(int[] a, int[] b) {
        try {
            if (((a[0] <= b[0] && b[b.length - 1] <= a[a.length - 1])) || (b[0] <= a[0] && a[a.length - 1] <= b[b.length - 1]) || (a[0] <= b[0] && b[0] <= a[a.length - 1] && a[a.length - 1] <= b[b.length - 1]) || (b[0] <= a[0] && a[0] <= b[b.length - 1] && b[b.length - 1] <= a[a.length - 1])) {
                return true;
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
    
    public int solution(int[][] lines) {
        int answer = 0;
        int[] first = lines[0];
        int[] second = lines[1];
        int[] third = lines[2];
        Set<Integer> set = new HashSet<>(); // 중복을 허용하지 않으므로 지역변수로 선언

        // 첫 번째와 두 번째 비교
        int[] temp1 = {};
        temp1 = overlapLines(first, second);
        if (temp1.length != 0) {
            answer = temp1.length - 1;
            for (int i = 0; i < temp1.length; i++) {
                set.add(temp1[i]);
            }
        }

        // 첫 번째와 세 번째 비교
        int[] temp2 = {};
        temp2 = overlapLines(first, third);
        boolean flage = false;  // temp1과 temp2가 겹쳐지지 않는 상황에서 set에 들어갔음을 파악할 수 있는 플래그
        if (temp2.length != 0) {
            if (temp1.length == 0) { // 즉, 첫 번째와 세 번쨰 비교에서 처음으로 겹치는 선이 나왔으면
                answer = temp2.length - 1;
                for (int i = 0; i < temp2.length; i++) {
                    set.add(temp2[i]);
                }
            } else {  // 즉, 첫째선 둘째선에서 모두 겹치고, 첫째선과 셋째선에서도 겹치는 상황
                if (isOverlap(temp1, temp2)) { // 겹치는 선들끼리 또 겹치는지 확인하기
                    for (int i = 0; i < temp2.length; i++) {
                        set.add(temp2[i]); // 겹치면 그냥 바로 해시셋에 넣어서 같이 엮어버리기
                    }
                    answer = set.size() - 1;
                } else { // 겹치지 않는 상황이다.
                    answer += temp2.length - 1;  // 그렇기에 temp2에서의 선분길이를 answer에 더해준다.
                    for (int i = 0; i < temp2.length; i++) {
                        set.add(temp2[i]);
                    }
                    flage = true;
                }
            }
        }

        // 두 번째와 세 번째 비교
        int[] temp3 = {};
        temp3 = overlapLines(second, third);
        if (temp3.length != 0) {
            if (temp1.length == 0 && temp2.length == 0) {  // 즉, 두번째와 세번쨰 비교에서 처음으로 겹치는 선이 나왔으면
                answer = temp3.length - 1;
                for (int i = 0; i < temp3.length; i++) {
                    set.add(temp3[i]);
                }
            } else if (temp1.length == 0) { // 즉, 첫번째와 세번째 비교시에만 겹치는 선분이 있던 경우
                if(isOverlap(temp2, temp3)) {
                    for (int i = 0; i < temp3.length; i++) {
                        set.add(temp3[i]);
                    }
                    answer = set.size() - 1;
                } else {
                    answer += temp3.length - 1;
                    for (int i = 0; i < temp3.length; i++) {
                        set.add(temp3[i]);
                    }
                }
            } else if (temp2.length == 0) { // 즉, 첫번째와 두번째 비교시에만 겹치는 선분이 있던 경우
                if(isOverlap(temp1, temp3)) {
                    for (int i = 0; i < temp3.length; i++) {
                        set.add(temp3[i]);
                    }
                    answer = set.size() - 1;
                } else {
                    answer += temp3.length - 1;
                    for (int i = 0; i < temp3.length; i++) {
                        set.add(temp3[i]);
                    }
                }
            } else { // 앞의 경우들이 모두 겹치는 경우였다면...
                int[] temp1_2 = set.stream().mapToInt(Integer::intValue).toArray();
                if (isOverlap(temp1_2, temp3)) {
                    if (flage) {
                        answer += temp3.length - 1;
                        for (int i = 0; i < temp3.length; i++) {
                            set.add(temp3[i]);
                        }
                    } else {
                        for (int i = 0; i < temp3.length; i++) {
                            set.add(temp3[i]);
                        }
                        answer = set.size() - 1;
                    }
                } else {
                    answer += temp3.length - 1;
                    for (int i = 0; i < temp3.length; i++) {
                        set.add(temp3[i]);
                    }
                }
            }
        }
        if (set.size() == 0) {
            answer = 0;
        }
        return answer;
    }
}