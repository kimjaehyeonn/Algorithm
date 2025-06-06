import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] after= new int[num_list.length];
        for(int i=0; i<num_list.length-n;i++) {
           after[i] = num_list[n+i];
       }
        for (int i = 0; i <n; i++) {
            after[num_list.length - n +i] = num_list[i];
        }
    
        return after;

    }
}