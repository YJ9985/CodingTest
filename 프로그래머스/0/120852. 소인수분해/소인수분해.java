import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> primeFactor = new ArrayList<>();
        int divisor = 2;
        
        while(n > 1){
            if(n % divisor == 0){
                if(!primeFactor.contains(divisor)){
                    primeFactor.add(divisor);
                }
                n /= divisor;
            } else {
                divisor++;
            }
        }
        
        int[] answer = new int[primeFactor.size()];
        for(int i = 0; i < primeFactor.size(); i++){
            answer[i] = primeFactor.get(i);
        }
        
        return answer;
    }
}