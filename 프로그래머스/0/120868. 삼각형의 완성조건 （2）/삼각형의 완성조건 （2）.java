class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = sides[0];
        int sum = 0;
        for(int side : sides){
            sum += side;
            if(side > max) max = side;
        }
        sum -= max;
        
        for(int i = max - sum + 1 ; i < max + sum; i++){
            answer++;
        }
        
        
        return answer;
    }
}