import java.util.*;

class Solution {
    int[] dr ={0,0,1,-1};
    int[] dc= {1,-1,0,0};
    
    private boolean isValid(int r, int c, int n, int m){
        return 0<=r && r<n && 0<= c && c<m;
    }
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0,0,1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int r = cur[0];
            int c= cur[1];
            int d = cur[2];
            
            if(r==n-1 && c ==m-1) {
                return d;
            }
            
            for(int i =0; i<4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                if(isValid(nr,nc,n,m) && !visited[nr][nc]&&maps[nr][nc]==1){
                    queue.offer(new int[] {nr,nc,d+1});
                    visited[nr][nc] = true;
                }
                
            }
        }
        return -1;
    }
}