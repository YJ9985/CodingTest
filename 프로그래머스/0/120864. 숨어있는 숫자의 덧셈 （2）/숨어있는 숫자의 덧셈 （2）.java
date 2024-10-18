class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num_list = "";
        
        // 문자열을 순회하며 숫자와 문자를 구분
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                // 숫자인 경우 num_list에 추가
                num_list += c;
            } else {
                // 숫자가 아닌 경우, num_list에 누적된 숫자가 있으면 합산
                if (!num_list.isEmpty()) {
                    answer += Integer.parseInt(num_list);
                    num_list = ""; // num_list 초기화
                }
            }
        }
        
        // 마지막에 남아 있는 숫자 처리
        if (!num_list.isEmpty()) {
            answer += Integer.parseInt(num_list);
        }
        
        return answer;
    }
}
