import java.util.*;
class Solution {
    Set<Integer> primeset;
    public int solution(String numbers) {
        primeset = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        backtrack(numbers, visited, "");
        return primeset.size();
    }
    void backtrack(String numbers, boolean[] visited, String cur) {
        if(cur.length() !=0 ){
            int num = Integer.parseInt(cur);
            if(isprime(num)) primeset.add(num);
        }
        
        for(int i =0; i<numbers.length();i++ ){
            if(!visited[i]){
                visited[i] = true;
                backtrack(numbers, visited, cur + numbers.charAt(i));
                visited[i]= false;
            }
        }
    }
    boolean isprime (int num ){
        if(num<2) return false;
        for(int i=2; i*i<=num; i++ ){
            if(num%i == 0 )return false;
        }
        return true;
    }
}