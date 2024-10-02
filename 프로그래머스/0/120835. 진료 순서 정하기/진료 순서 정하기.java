import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] cloneEmergency = emergency.clone();        
        Arrays.sort(cloneEmergency);
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        
        for(int i = 0; i < cloneEmergency.length; i++){
            rankMap.put(cloneEmergency[i], cloneEmergency.length -i);
        }
        
        int[] answer = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++){
            answer[i] = rankMap.get(emergency[i]);
        }
        
        return answer;
    }
}