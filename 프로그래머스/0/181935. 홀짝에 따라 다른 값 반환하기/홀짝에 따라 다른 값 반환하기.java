class Solution {
    public int solution(int n) {
        int answer= 0;
        if (n%2 == 0 ) {
            for (int i =0; i<n/2; i++) {
                answer += (n -2*i)*(n-2*i);
            }
        } else {
            for (int i=0; i<n/2+1; i++ ){
                answer += (n -2*i);
            }
        }
        return answer;
    }
}