import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = 1; i * code <= cipher.length(); i++){
            answer += cipher.charAt(i * code - 1);
        }
        return answer;
    }
}