class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int[] intervals = new int[common.length - 1];
        for (int i = 0; i < intervals.length; i++) {
            intervals[i] = common[i + 1] - common[i];
        }

        if (intervals[0] == intervals[1]) { // 이는 등차수열이라는 의미
            answer = common[common.length - 1] + intervals[0];
        } else {  // 이는 등비수열이라는 뜻
            int index = intervals[1] / intervals[0];
            answer = common[common.length - 1]  * index;
        }
        return answer;
    }
}