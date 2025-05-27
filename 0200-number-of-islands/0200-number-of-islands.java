import java.util.*;
class Solution {
    int[] dr = { -1,1,0,0};
    int[] dc = {0,0,1,-1};

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for(int r =0; r<m; r++){
            for(int c = 0; c <n; c++){
                if( !visited[r][c] && grid[r][c]=='1' ){
                    bfs(r,c, visited, grid);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(int r, int c, boolean[][] visited, char[][] grid ){
        int m = grid.length;
        int n = grid[0].length;
    
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {r,c});
        visited[r][c] = true;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int sr = cur[0];
            int sc = cur[1];

            for(int i =0; i < 4; i++){
                int nr = sr + dr[i];
                int nc = sc + dc[i];

                if(isValid(nr,nc,m,n) && !visited[nr][nc] && grid[nr][nc] == '1'){
                    visited[nr][nc] = true;
                    queue.offer(new int[] {nr,nc});
                }
            }
        }
    }

    private boolean isValid(int r, int c, int m ,int n) {
        return 0<=r && r<m && 0<= c && c< n;
    }
}