import java.util.*;
class Solution {
    int[] dr = {1,-1,0, 0};
    int[] dc = { 0,0, 1, -1};
    
    public int solution(int[][] maps) {
        int m = maps.length;
        int n = maps[0].length;
        boolean[][] visited = new boolean[m][n];
        
        if (maps[0][0] == 0 || maps[m-1][n-1] ==0 ) {
            return -1;
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0,0,1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0] ;
            int c = current[1];
            int d = current[2];
             if (r == m - 1 && c == n - 1) {
                return d;
            }

            
            for (int i =0; i<4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if (isValid(nr, nc, m ,n ) && !visited[nr][nc] && maps[nr][nc]==1) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr,nc,d+1});
                    
                }
            }
        }
        return -1;
    }
    private boolean isValid(int r, int c, int m ,int n) {
        return 0<=r && r<m && 0<=c && c<n;
    }
}