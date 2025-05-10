import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // 4방향 이동 (상, 하, 좌, 우)
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        // 모든 셀 순회
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                // 육지이고 방문 안 했으면 BFS 시작
                if (grid[r][c] == '1' && !visited[r][c]) {
                    bfs(grid, visited, r, c);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, boolean[][] visited, int sr, int sc) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        visited[sr][sc] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (isValid(nr, nc, n, m) && grid[nr][nc] == '1' && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }

    private boolean isValid(int r, int c, int n, int m) {
        return r >= 0 && r < n && c >= 0 && c < m;
    }
}
