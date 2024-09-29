class Solution {
    public String solution(int age) {
        String strAge = String.valueOf(age);
        String answer = "";
        
        for(int i = 0; i < strAge.length(); i++){
            answer += (char)('a' + (strAge.charAt(i) - '0'));
        }
        
        return answer;
    }
}