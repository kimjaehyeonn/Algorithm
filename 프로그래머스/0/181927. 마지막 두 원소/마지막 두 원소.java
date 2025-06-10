import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length +1];
        answer = Arrays.copyOfRange(num_list, 0,answer.length);
        answer[answer.length-1]  = num_list[num_list.length-1] > num_list[num_list.length-2] ? num_list[num_list.length-1] - num_list[num_list.length-2] : num_list[num_list.length-1]*2;    
        return answer;
    }
}