class Solution {
    public int[] solution(int n) {
        int count = (n+1)/2;
        int[] answer = new int[count];
        
        int index = 0;
        for(int a = 1; a <= n; a++){
            if(a % 2 != 0){
                answer[index] = a;
                index++;
            } 
        }
        
        return answer;
    }
}