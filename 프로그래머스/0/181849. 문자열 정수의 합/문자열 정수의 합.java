class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] str = num_str.split("");
        for(String st : str) {
            answer += Integer.parseInt(st);
        }
        return answer;
    }
}