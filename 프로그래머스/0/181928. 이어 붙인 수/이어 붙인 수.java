class Solution {
    public int solution(int[] num_list) {
        String hol= "";
        String zak="";
        int answer=0;
        for (int num : num_list) {
           if(num%2==0) {
               zak += num;
           } else {hol +=  num;}
        }
        answer = Integer.parseInt(hol) + Integer.parseInt(zak);
        return answer;
    }
}