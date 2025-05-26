import java.util.*;
class Solution {
    
    class Words{
    String node;
        int edge;
        Words(String node, int edge) {
            this.node =node;
            this.edge = edge;
        }
    }
    
    private int isonediff(String word1, String word2) {
        int count = 0;
        for( int i = 0; i<word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i))
                count++;
        }
        return count;
    }
    
    public int solution(String begin, String target, String[] words) {
        boolean[]  visited = new boolean[words.length];
        
        Queue<Words> q = new LinkedList<>();
        q.offer(new Words(begin, 0));
        
        while(!q.isEmpty()) {
            Words cur = q.poll();
            String node = cur.node;
            int edge = cur.edge;
            
            if(node.equals(target)){
                return edge;
            }
            for (int i = 0; i <words.length; i++ ){
                if(isonediff(node,words[i])==1 && !visited[i]){
                    q.offer(new Words(words[i],edge+1));
                    visited[i]=true;
                }
            }
        }
        
        return 0;
    }
}