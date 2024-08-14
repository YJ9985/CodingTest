class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        //1. my_string을 charAt으로 나누기
        for(int i = 0; i < my_string.length(); i++){
            //2. my_string에 letter가 있는지 확인
            if(my_string.charAt(i) != letter.charAt(0)){
             //3. 있다면 answer에 추가
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
        
    }
}