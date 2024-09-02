class Solution {
    public int[] solution(int n, int[] numlist) {
        int temp1 = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0) temp1++;
        }
        int[] answer = new int[temp1];
        
        int temp2 = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0) {
                answer[temp2] = numlist[i];
                temp2++;
            }
        }
        
        return answer;
    }
}