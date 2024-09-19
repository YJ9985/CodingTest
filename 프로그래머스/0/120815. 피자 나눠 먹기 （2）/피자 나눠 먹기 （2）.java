class Solution {
    public int solution(int n) {
        // i = 피자 판 수
        for(int i = 1; i <= n; i++){
            if((6 * i) % n == 0) return i;
        }
        
        return n;
    }
}