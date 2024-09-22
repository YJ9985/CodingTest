import java.util.LinkedHashSet;

public class Solution {
    public String solution(String my_string) {
        // LinkedHashSet을 사용하여 입력 문자열의 중복 문자를 제거하고 순서를 유지
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // 문자열의 각 문자를 set에 추가
        for (char c : my_string.toCharArray()) {
            set.add(c);
        }
        
        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();
        
        // set의 문자를 다시 문자열로 변환
        for (char c : set) {
            result.append(c);
        }
        
        // 최종 문자열 반환
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("hello"));  // "helo"
        System.out.println(sol.solution("programming"));  // "progamin"
    }
}
