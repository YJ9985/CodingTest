import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        answer[0] = Integer.MIN_VALUE;
        answer[1] = -1;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > answer[0]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}