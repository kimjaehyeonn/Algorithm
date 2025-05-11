import java.util.*;

class Solution {
    //1. 전역 변수 설정
    int[] dr = { 0,0,1,-1};
    int[] dc = { 1,-1,0,0};

    // 2. main
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int answer= 0;


        for (int r = 0; r < m; r++ ){
            for (int c = 0; c<n; c++){
                if(grid[r][c]=='1' && !visited[r][c]){

                bfs(grid, visited, r, c);
                answer++;
            }}
        }
    return answer;
    }

    public void bfs(char[][] grid, boolean[][] visited, int sr, int sc) {
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {sr,sc});
        visited[sr][sc] = true;

        while( !queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

             for ( int i =0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if(isValid(nr, nc, m,n  ) && grid[nr][nc] == '1' && !visited[nr][nc]) {
                visited[nr][nc] = true;
                queue.offer(new int[] {nr,nc});
                
             }
             }

             
        }

    }

    public boolean isValid(int r, int c, int m , int n ) {
        return 0<= r && r< m &&  0<= c && c < n;
    }

}