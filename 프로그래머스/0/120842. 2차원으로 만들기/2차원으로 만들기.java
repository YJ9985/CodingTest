class Solution {
    public int[][] solution(int[] num_list, int n) {
        int i = num_list.length / n;
        
        int[][] result = new int[i][n];
        int index = 0;
        
        for(int j = 0; j < i; j++){
            for(int k = 0; k < n; k++){
                result[j][k] = num_list[index];
                index++;
            }
        }
        
        return result;
    }
}