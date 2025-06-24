import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < arr.length; ){
            if(s.isEmpty()) {
                s.push(arr[i]);
                i++;
            }
            else if(s.peek() < arr[i] ) {
                s.push(arr[i]);
                i++;
            } else if(s.peek()  >= arr[i]) {
                s.pop();
            }
        }
        int[]  stk = s.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}