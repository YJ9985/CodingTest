import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int temp = array[0] - n;
        int answer = array[0];
        
        for(int i = 0; i < array.length; i++){
            int temp2 = array[i] - n;
            if(Math.abs(temp2) < Math.abs(temp)) {
                temp = array[i] - n;
                answer = array[i];
            }
            else if(Math.abs(temp2) == Math.abs(temp)){
                if(array[i] < answer) answer = array[i];
            }
        }
        return answer;
    }
}