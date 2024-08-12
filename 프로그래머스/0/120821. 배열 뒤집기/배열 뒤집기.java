class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l];
        
        for(int i = l-1; i >= 0; i--){
            answer[l-1-i] = num_list[i];
        }
        return answer;
    }
}