import java.util.*;

class Solution {
    public int solution(int n) {
        //정수를 문자열로 변환
        String strN = String.valueOf(n);
        
        int answer = 0;
        for(int i = 0; i < strN.length(); i++){
            answer += strN.charAt(i) - '0';
        }
        
        return answer;
    }
}