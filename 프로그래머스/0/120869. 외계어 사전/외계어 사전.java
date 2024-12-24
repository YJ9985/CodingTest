import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        char[] c = String.join("", spell).toCharArray();
        Arrays.sort(c);
        String sortedS = new String(c);
        
        for(String d : dic){
            char[] c2 = d.toCharArray();
            Arrays.sort(c2);
            String sortedD = new String(c2);
            
            if(sortedS.equals(sortedD)){
                return 1;
            }
        }
        
        return 2;
    }
}