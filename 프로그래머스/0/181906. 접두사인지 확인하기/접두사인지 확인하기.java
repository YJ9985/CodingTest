class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int k = 1;
        
        String[] arr = new String[my_string.length()];
        
        // 각 인덱스에 문자를 하나씩 늘려가면서 담는다 -> 결국 모든 문자 경우들이 담긴 배열이 만들어짐
        for (int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.substring(0, k);
            k++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(is_prefix)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}