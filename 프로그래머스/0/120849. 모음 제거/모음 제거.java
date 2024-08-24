class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //1. 문자열 내부의 문자를 하나씩 쪼개어 담기:CharAt()?
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            //2.담겨진 문자가 모음과 일치하지 않는지 확인
            if(c != 'a' && c != 'e' && c!= 'i' && c != 'o' && c != 'u'){
                
                //3.일치하지 않으면 문자열에 담기
                answer += my_string.charAt(i);
            }   
        }
        
        return answer;
    }
}