import java.util.*;

class Solution {
    int[] dr = {0, 0 ,1, -1};
    int[] dc = { 1, -1, 0 , 0};
  

    public int numIslands(char[][] grid) {
        int count = 0;
          int m = grid.length;
 int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for ( int r = 0; r < m; r++) {
            for (int c = 0;  c< n; c ++) {
                if(grid[r][c] == '1' && !visited[r][c]) {
                    bfs(r, c, grid, visited);
                    count++;
                }
            }
        }
        return count;

    }

    private void bfs(int sr, int sc, char[][] grid, boolean[][] visited) {
          int m = grid.length;
 int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        visited[sr][sc]= true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            for (int i=0; i<4; i++){
                int nr = r +dr[i];
                int nc = c + dc[i];

                if(isValid(nr,nc,m,n)  && !visited[nr][nc]&& grid[nr][nc]=='1'){
                    visited[nr][nc] = true;
                    queue.offer(new int[] {nr,nc});
                    
                }
            }


        }

    }

    private boolean isValid(int r, int c, int m, int n) {
        return 0 <= r && r<m &&  0<=c && c<n;
    }

}