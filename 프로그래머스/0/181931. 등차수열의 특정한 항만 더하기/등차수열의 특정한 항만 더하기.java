class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] answer = new int[included.length];
        int result = 0;
        for(int i =0; i<included.length;i++) {
            answer[i] = included[i] == true ? a+d*i : 0;
            result += answer[i];
        }
        
        return result;
    }
}