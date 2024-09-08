import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)) numbers.add(c - '0');
        }
        
        
        int[] answer = new int[numbers.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}