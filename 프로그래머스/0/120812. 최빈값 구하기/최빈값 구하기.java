class Solution {
    public int solution(int[] array) {
        int[] frequency = new int[1001]; // 숫자의 범위가 0 ~ 1000이라고 가정
        
        // 1. 배열 내부의 숫자 빈도수 계산
        for (int num : array) {
            frequency[num]++;
        }
        
        int maxFrequency = 0;
        int mode = -1;
        
        // 2. 최빈값 찾기
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mode = i;
            } else if (frequency[i] == maxFrequency) {
                mode = -1; // 최빈값이 여러 개면 -1로 설정
            }
        }
        
        return mode;
    }
}
