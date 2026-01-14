class Solution {
    private static int[] binaryArrayMethod(int n) {
        String binaryStr = Integer.toBinaryString(n);
        int[] binaryArr = new int[binaryStr.length()];
        
        for (int i = 0; i < binaryArr.length; i++) {
            binaryArr[i] = binaryStr.charAt(i) - '0';
        }
        
        return binaryArr;
    }
    
    private static boolean compareOneCountEqual(int[] first, int[] second) {
        int firstOneCount = 0;
        int secondOneCount = 0;
        
        for (int i = 0; i < first.length; i++) {
            if (first[i] == 1) {
                firstOneCount++;
            } 
        }
        
        for (int i = 0; i < second.length; i++) {
            if (second[i] == 1) {
                secondOneCount++;
            }
        }
        
        return firstOneCount == secondOneCount ? true : false;
    }
    
    public int solution(int n) {
        int answer = n + 1;
        int[] first = binaryArrayMethod(n);
        
        while(true) {
            int[] second = binaryArrayMethod(answer);
            
            if (compareOneCountEqual(first, second)) {
                break;
            } else {
                answer += 1;
            }
        }
        return answer;
    }
}