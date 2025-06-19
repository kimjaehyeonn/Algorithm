import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries)  {
        int[] answer = new int[queries.length];

        for(int i=0; i<queries.length; i++ ) {
            List<Integer> list = new ArrayList<>();

            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
           /// s~e 까지 list 만들기
            for (int j= 0; j<e-s+1; j++ ){
                if(arr[s+j] > k) {
                list.add(arr[s +j]); 
                }
            }
            
            Collections.sort(list);
            answer[i] =  list.size() == 0 ? -1 : list.get(0);
        }
        return answer;
    }
}