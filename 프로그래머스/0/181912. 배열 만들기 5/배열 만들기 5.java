import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< intStrs.length; i++ ){
            int e = intStrs[i].length();
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if (num > k) {
                list.add(num);
            }
                
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}
