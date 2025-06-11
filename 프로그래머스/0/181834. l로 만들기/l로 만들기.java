class Solution {
    public String solution(String myString) {
        char[] cha = myString.toCharArray();
        String answer = "";
        for(char ch : cha) {
           if (ch <= 'l' ) {
               ch = 'l';
           } 
            answer += ch;
        }
        return answer;
    }
}