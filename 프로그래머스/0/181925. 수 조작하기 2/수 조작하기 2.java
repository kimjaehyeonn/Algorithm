class Solution {
    public String solution(int[] numLog) {
        String answer = "";
       for (int i=0; i<numLog.length-1; i++){
           switch(numLog[i+1] - numLog[i]) {
               case 1:
                   answer += "w";
                   continue;
               case -1:
                   answer += "s";
                   continue;
               case 10:
                   answer += "d";
                   continue;
               case -10:
                   answer +="a";
           }
       }
        return answer;
    }
}