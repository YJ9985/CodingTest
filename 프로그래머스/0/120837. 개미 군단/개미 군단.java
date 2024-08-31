class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int gen = hp/5;
        int mid = (hp%5) / 3;
        int work = (hp % 5) % 3;
        
        answer = gen + mid + work;
        return answer;
    }
}