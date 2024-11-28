class Solution {
    public String solution(String bin1, String bin2) {
        //1. bin1과 bin2의 길이 동일하게 맞추기
        int length1 = bin1.length();
        int length2 = bin2.length();
        int diff = Math.abs(length1 - length2);
        
        if(length1 > length2){
            bin2 = "0".repeat(diff) + bin2;
        } else if(length1 < length2){
            bin1 = "0".repeat(diff) + bin1;
        }
        
        //2. bin1과 bin2를 마지막 숫자부터 더하기
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        for(int i = bin1.length() - 1; i >= 0; i--){
            int digit1 = bin1.charAt(i) - '0';
            int digit2 = bin2.charAt(i) - '0';
            
            int sum = digit1 + digit2 + carry;
            if(sum >= 2){
                carry = 1;
                result.append(sum - 2);
            } else{
                carry = 0;
                result.append(sum);
            }
        }
        
        //3. 마지막 덧셈 후 1 남으면 추가로 1 더해줌
        if(carry == 1){
            result.append(1);
        }
        
        //4. 결과값을 반대로 return        
        return result.reverse().toString();
        
    }
}