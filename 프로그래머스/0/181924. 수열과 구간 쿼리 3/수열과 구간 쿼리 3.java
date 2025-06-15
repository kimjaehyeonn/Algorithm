import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr,arr.length);
        for(int i=0; i< queries.length; i++ ){
            int a = queries[i][0];
            int b = queries[i][1];
            int[] temp = Arrays.copyOf(answer , answer.length);

            answer[a] = temp[b];
            answer[b] = temp[a];
        }
        return answer;
    }
}