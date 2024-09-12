class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        
        for(int i= 0; i < numbers.length -1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int a = numbers[i] * numbers[j];
                if(a > answer) answer = a;
            }
            
        }
        return answer;
    }
}