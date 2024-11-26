import java.util.*;

class Solution {
    public int solution(String s) {
        String[] newS = s.split(" ");
        int answer = 0;
        int lastValue = 0;
        
        for(int i = 0; i < newS.length; i++){
            if(newS[i].equals("Z")){
                answer -= lastValue;
            } else {
                lastValue = Integer.parseInt(newS[i]);
                answer += lastValue;
            }
        }
        
        return answer;
    }
}