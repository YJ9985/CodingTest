class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        //1. array.length만큼 비교하기
        //2. array[i]과 n이 같다면 answer++
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}