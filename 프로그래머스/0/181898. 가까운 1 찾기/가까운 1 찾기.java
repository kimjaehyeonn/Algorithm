import java.util.*;
class Solution {
    public int solution(int[] arr, int idx) {
       int answer =0;
        for(int i = idx; i< arr.length; i++ ) {
            if (arr[i] == 1 ) {return answer = i;}
            else { answer = -1;}
     
        }return answer;
    }
}