import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] strB = before.toCharArray();
        char[] strA = after.toCharArray();
        
        Arrays.sort(strB);
        Arrays.sort(strA);
        
        if(Arrays.equals(strB, strA)){
            return 1;
        } else {
            return 0;
        }
    }
}