class Solution {
    public int solution(int balls, int share) {
        if(share > balls - share) {
            share = balls - share;
        }
        
        double result = 1.0;
        
        for(int i = 0; i < share; i++) {
            result *= (double)(balls - i) / (i + 1);
        }
        
        return (int)Math.round(result);
    }
}