import java.util.*;

class Solution {
    private static int[] mathGiveUp1(int[] answers) {
        int[] mathGiveUp1answer = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            if (i % 5 == 0) {
                mathGiveUp1answer[i] = 1;
            } else {
                mathGiveUp1answer[i] = (i % 5) + 1;
            }
        }
        return mathGiveUp1answer;
    }
    
    private static int[] mathGiveUp2(int[] answers) {
        int[] mathGiveUp2answer = new int[answers.length];
        int[] exampleArr = { 1,3,4,5 };
        int index = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (i % 2 == 0) {
                mathGiveUp2answer[i] = 2;
            } else {
                if (index > 3) {
                    index = 0;
                }
                mathGiveUp2answer[i] = exampleArr[index];
                index++;
            }
        }
        return mathGiveUp2answer;
    }
    
    private static int[] mathGiveUp3(int[] answers) {
        int[] mathGiveUp3answer = new int[answers.length];
        int[] exampleArr = { 3,1,2,4,5 };
        int thisNumber = 0;
        int index = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (i % 2 == 0) {
                if (index > 4) {
                    index = 0;
                }
                mathGiveUp3answer[i] = exampleArr[index];
                thisNumber = exampleArr[index];
                index++;
            } else {
                mathGiveUp3answer[i] = thisNumber;
            }
        }
        return mathGiveUp3answer;
    }
    
    private static int howManyCorrect(int[] myAnswer, int[] answers) {
        int num = 0;
        for (int i = 0; i < answers.length; i++) {
            if (myAnswer[i] == answers[i]) {
                num++;
            }
        }
        return num;
    }
    
    public int[] solution(int[] answers) {
        int[] hateMathMan1 = mathGiveUp1(answers);
        int[] hateMathMan2 = mathGiveUp2(answers);
        int[] hateMathMan3 = mathGiveUp3(answers);
        
        int hateMathMan1Count = howManyCorrect(hateMathMan1, answers);
        int hateMathMan2Count = howManyCorrect(hateMathMan2, answers);
        int hateMathMan3Count = howManyCorrect(hateMathMan3, answers);
        int[] scores = { hateMathMan1Count, hateMathMan2Count, hateMathMan3Count };
        int maxScore = Math.max(hateMathMan1Count, Math.max(hateMathMan2Count, hateMathMan3Count));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}