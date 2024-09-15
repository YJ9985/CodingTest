class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] temp = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            temp[i] = numbers[i];
        }
        
        if(direction.equals("right")){
            numbers[0] = temp[numbers.length - 1];
            for(int i = 1; i < numbers.length; i++){
                numbers[i] = temp[i - 1];
            }
        } else if(direction.equals("left")){
            numbers[numbers.length - 1] = temp[0];
            for(int i = 0; i < numbers.length - 1; i++){
                numbers[i] = temp[i + 1];
            }
        }
        
        return numbers;
    }
}