import java.util.stream.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
    int answer = 0;
        int a = IntStream.of(arr1).sum();
        int b = IntStream.of(arr2).sum();
        if (arr1.length != arr2.length) {
    answer= arr1.length > arr2.length ? 1 :-1;
        } else if ( (arr1.length == arr2.length) && a!=b ){
            answer = a > b ? 1 : -1;
        } 
        return answer;
    }
}