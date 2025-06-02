import java.util.*;
class Solution {
    public int solution(int[] num_list) {
       int sum = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
        int multiply = Arrays.stream(num_list).reduce((x,y)->x*y).getAsInt();
        return num_list.length >10 ? sum : multiply;
    }
}