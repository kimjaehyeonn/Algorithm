import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
    int answer = n;
        for (int i =0; i < wires.length; i++) {
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int j=0; j<=n; j++) {
            graph.add(new ArrayList<>());
        }
        
        for(int j =0; j<wires.length; j++){
            if (i==j) continue;
            int a = wires[j][0];
            int b = wires[j][1];
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        int count = bfs(1, graph, n);
        
        int diff = Math.abs(n -count - count);
            
            answer = Math.min(answer, diff);
        
    }
        return answer;
    }
    
    private int bfs(int start, List<List<Integer>> graph, int n ){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        int count = 1;
        queue.offer(start);
        visited[start] = true;
        
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next: graph.get(cur) ){
            if(!visited[next]){                visited[next]= true;
                queue.offer(next);
                count++;}
            }
}
               return count;
 }}
