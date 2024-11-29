class Solution {
    public String[] solution(String my_str, int n) {
        int count = 0;
        if(my_str.length() % n == 0){
            count = my_str.length() / n;
        } else{
            count = my_str.length() / n + 1;
        }
        
        String[] answer = new String[count];
        
        int index = 0;
        for(int i = 0; i < count; i++){
            answer[i] = my_str.substring(index, Math.min(index + n, my_str.length()));
            index += n;
        }
        
        return answer;
    }
}