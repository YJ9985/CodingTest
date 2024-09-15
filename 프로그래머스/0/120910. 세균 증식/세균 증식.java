class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        int i = 0;
        while(true){
            if(i < t){
                n = n * 2;    
                i++;
            }
            if(i >= t) break;
        }
        answer = n;
        return answer;
    }
}