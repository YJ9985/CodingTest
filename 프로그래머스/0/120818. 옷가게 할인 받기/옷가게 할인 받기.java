class Solution {
    public int solution(int price) {
        int answer = 0;
        
        //1. 10, 30, 50 조건식 작성
        if(price >= 100000 && price < 300000){
            answer = (int)(price * 0.95);
        } else if(price >= 300000 && price < 500000){
            answer = (int)(price * 0.9);
        } else if(price >= 500000) {
            answer = (int)(price * 0.8);
        } else{
            answer = price;
        }
        
        //2. 조건 별 할인율 적용 
        //3. 가격 answer에 대입
        return answer;
    }
}