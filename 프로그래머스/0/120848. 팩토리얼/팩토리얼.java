class Solution {
    public int solution(int n) {
        int pac = 1;
        int i = 1;
        
        while(true){
            if(pac > n) break;
            i++;
            pac *= i;
        }
        
        return i-1;
        
    }
}