import java.util.*;

class Solution {
    public String solution(String my_string) {
        String lowerString = my_string.toLowerCase();
        char[] c = lowerString.toCharArray();
        
        Arrays.sort(c);
        
        String answer = new String(c);
        return answer;
    }
}