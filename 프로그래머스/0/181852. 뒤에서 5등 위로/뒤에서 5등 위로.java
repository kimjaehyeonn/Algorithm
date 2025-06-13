import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer  =    IntStream.of(num_list).sorted().toArray();
        
        int[] result= new int[answer.length -5];
        
        for( int i=0; i<result.length; i++ ){
            result[i] =  answer[i+5];
        }

        return result;
    }
}