class Solution {
    public String solution(String my_string, int num1, int num2) {
        // StringBuilder를 사용하여 문자열을 수정 가능하게 함
        StringBuilder sb = new StringBuilder(my_string);
        
        // num1 위치의 문자와 num2 위치의 문자를 교환
        char temp = sb.charAt(num1);  // num1 위치의 문자를 임시로 저장
        sb.setCharAt(num1, sb.charAt(num2));  // num1 위치에 num2 위치의 문자 설정
        sb.setCharAt(num2, temp);  // num2 위치에 임시로 저장한 num1 위치의 문자 설정
        
        // 수정된 문자열을 반환
        return sb.toString();
    }
}
