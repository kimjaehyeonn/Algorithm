class Solution { 
    int[] dr = { 1, 1, 1, -1, -1, -1, 0, 0};
    int[] dc = { 0, 1, -1, 0, 1, -1, 1, -1};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        
        if (grid[0][0]==1 || grid[n-1][n-1]==1) {
            return -1;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0,0,1});
        visited[0][0] =true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int d = current[2];

            if (r == n-1 && c == n-1) {
                return d;
            }
            for (int i=0; i<8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(isValid(nr,nc,n)&& !visited[nr][nc] && grid[nr][nc]==0) {
                    visited[nr][nc]= true;
                    queue.offer(new int[] {nr,nc,d+1});
                }
            }
        }
        return -1;
    }
    
     private boolean isValid (int r, int c, int n){
        return 0<= r && r < n && 0<= c && c<n;
    }
}