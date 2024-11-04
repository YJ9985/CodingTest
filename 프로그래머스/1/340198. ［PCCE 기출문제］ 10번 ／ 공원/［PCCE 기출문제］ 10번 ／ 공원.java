class Solution {
    public int solution(int[] mats, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;
        int maxPossible = 0;
        
        // 주어진 위치에 특정 크기의 돗자리를 놓을 수 있는지 확인하는 함수
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // '-1'이 아닌 경우(이미 사용 중인 공간)는 건너뛰기
                if (!park[i][j].equals("-1")) {
                    continue;
                }
                
                // 현재 위치에서 가능한 최대 크기 찾기
                int size = 1;
                while (canPlaceMat(i, j, size, park)) {
                    // 현재 크기가 가진 돗자리 중 하나와 일치하는지 확인
                    if (containsSize(mats, size)) {
                        maxPossible = Math.max(maxPossible, size);
                    }
                    size++;
                }
            }
        }
        
        return maxPossible > 0 ? maxPossible : -1;
    }
    
    // 특정 위치에 주어진 크기의 돗자리를 놓을 수 있는지 확인하는 메소드
    private boolean canPlaceMat(int r, int c, int size, String[][] park) {
        // 범위를 벗어나면 불가능
        if (r + size > park.length || c + size > park[0].length) {
            return false;
        }
        
        // size x size 영역에 장애물이 있는지 확인
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (!park[i][j].equals("-1")) {  // '-1'이 아닌 경우는 사용할 수 없는 공간
                    return false;
                }
            }
        }
        return true;
    }
    
    // mats 배열에 특정 크기가 있는지 확인하는 메소드
    private boolean containsSize(int[] mats, int size) {
        for (int mat : mats) {
            if (mat == size) {
                return true;
            }
        }
        return false;
    }
}