import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string);
        String reversed = new StringBuilder(my_string.substring(s,e+1)).reverse().toString();
        return answer.replace(s,e+1,reversed).toString();
    }
}