import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer= n;
        for (int i =0; i< wires.length; i++ ){
            List<List<Integer>> tree = new ArrayList<>();
            
            for (int j = 0; j<=n; j++) {
tree.add(new ArrayList<>());                
            }
            
            for ( int j = 0; j<wires.length; j++) {
                if( i == j)  continue;
                int a = wires[j][0];
                int b = wires[j][1];
                tree.get(a).add(b);
                tree.get(b).add(a);              
            }
        
            int count = bfs(1, tree, n);
            
            int diff = Math.abs(n - count - count);
            answer = Math.min(answer, diff);
        }
        return answer;
    }
    private int bfs(int start, List<List<Integer>> tree, int n ) {
        boolean[] visited = new boolean[n+1];
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int count =1; 
        
        while(!queue.isEmpty()) {
            int now = queue.poll();
            for ( int next: tree.get(now)) {
                if(!visited[next]) {
                    visited[next] =true;
                    queue.offer(next);
                    count++;
                }
            }
            
        }
    return count;
    }
    
}