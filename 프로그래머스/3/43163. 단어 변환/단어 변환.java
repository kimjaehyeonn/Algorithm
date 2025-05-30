import java.util.*;
class Solution {
    class Words{
        String word;
        int count;
        
        Words(String word, int count){
            this.word = word;
            this.count = count;
        }
    }
    
    private boolean isonediff(String word1, String word2) {
        int count =0;
        for (int i= 0; i < word1.length(); i++){
            if ( word1.charAt(i) != word2.charAt(i)){
                count++;
            }
        }
        if (count == 1 ) {return true;}else {return false;}
    }
    
    
    public int solution(String begin, String target, String[] words) {
       boolean[] visited = new boolean[words.length];
        Queue<Words> q = new LinkedList<>();
        q.offer(new Words (begin, 0));
        
        
        if(!Arrays.asList(words).contains(target)) {
            return 0;
        }
        
        while(!q.isEmpty()) {
            Words cur = q.poll();
            String word= cur.word;
            int count = cur.count;
            
            if ( word.equals(target)){
                return count;
            }
            for( int i=0; i<words.length; i++){
                if(!visited[i] && isonediff(word,words[i])) {
                    q.offer(new Words(words[i],count+1));
                    visited[i] = true;
                }
            }
        }
        return 0;
    }
}