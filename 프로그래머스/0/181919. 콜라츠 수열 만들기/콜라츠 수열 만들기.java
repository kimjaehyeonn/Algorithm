import java.util.*;
class Solution {
      List<Integer> list = new LinkedList<>();
    public int[] solution(int n) {
        List<Integer>  list  = process(n);
        int[] result = new int[list.size()];
        for(int i =0; i<result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    private List<Integer> process(int x) {
        list.add(x);
        if (x ==1 ) {
             return list;
        }
       return  x%2 != 0 ? process(3*x+1) : process(x/2);
    }
}