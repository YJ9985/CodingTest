class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        int idx = 0;
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.charAt(i) == '2') {
                answer += '0';
                idx++;
            } else if(rsp.charAt(i) == '0') {
                answer += "5";
                idx++;
            } else if(rsp.charAt(i) == '5'){
                answer += "2";
                idx++;
            }
        
        }
       
        return answer;
    }
}