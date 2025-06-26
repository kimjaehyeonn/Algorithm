import java.util.*;
class Solution {
    public String solution(int q, int r, String code) {
        String[] arr =code.split("");
        List<String> list = new ArrayList<>();
        for( int i = 0; i< arr.length; i++) {
            if(i%q ==r) {
                list.add(arr[i]);
            }
        }
        
        String answer = "";
        for( int i = 0; i<list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}