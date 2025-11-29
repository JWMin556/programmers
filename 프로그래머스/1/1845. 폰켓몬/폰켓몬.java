import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numsSize = nums.length;
        Set<Integer> notDuplicatedPoketmon = new HashSet<>();
        
        for (int i = 0; i < numsSize; i++) {
            notDuplicatedPoketmon.add(nums[i]);
        }
        
        if ((numsSize / 2) >= notDuplicatedPoketmon.size()) {
            answer = notDuplicatedPoketmon.size();
        } else {
            answer = (numsSize / 2);
        }
        
        return answer;
    }
}