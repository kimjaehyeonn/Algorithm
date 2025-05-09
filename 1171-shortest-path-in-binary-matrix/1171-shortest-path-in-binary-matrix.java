class Solution {
    // 8방향 이동을 위한 배열
    int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        // 1. 엣지 케이스 처리
        if (grid[0][0] == 1 || grid[n-1][n-1]==1 ){
            return -1;
        }
        
        // 2. BFS 초기화 (큐, 방문 배열 등)
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
         queue.offer(new int[] {0,0,1});  

        // 3. BFS 실행
        while (!queue.isEmpty()) {
            // a. 현재 위치 가져오기
            int[] current= queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];
             
            // b. 목표 도달 확인
            if (row == n-1 && col ==n-1) {
                return distance;
            }
            // c. 8방향 탐색 및 이동
            for (int i = 0; i < 8; i++) {
                // 다음 위치 계산
                int nextRow = row + dr[i];
                int nextCol = col + dc[i];

                // 유효성 검사 (범위, 미방문, 값이 0)
                if (isValid(nextRow, nextCol,n)&& !visited[nextRow][nextCol] && grid[nextRow][nextCol] == 0){
                // 큐에 추가 및 방문 표시
                queue.offer(new int[] {nextRow, nextCol, distance +1});
                visited[nextRow][nextCol] = true;
                }
            }
        }
        
        // 4. 목표에 도달하지 못한 경우
        return -1;
    }
    
    // 위치 유효성 검사 함수
    public static boolean isValid(int r, int c, int n ) {
        return 0<= r && r < n && 0 <=c && c<n;
    }
}