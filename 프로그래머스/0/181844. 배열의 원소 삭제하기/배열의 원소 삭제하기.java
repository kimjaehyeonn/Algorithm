import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length; i++) {
            list.add(arr[i]);
        }
        
        for(int i: delete_list) {
            if(list.contains(i)) list.remove(Integer.valueOf(i));
        }
        int[] answer= list.stream().mapToInt(Integer::intValue).toArray();
        return answer;    
    }
}
