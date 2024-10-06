class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String kStr = Integer.toString(k);
        
        for(int num = i; num <= j; num++){
            String numStr = Integer.toString(num);
            count += numStr.length() - numStr.replace(kStr, "").length();
        }
        
        return count;
    }
}