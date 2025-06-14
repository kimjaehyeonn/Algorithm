class Solution {
    public String solution(String code) {
        String[] str = code.split("");
        String answer = ""; 
        int count = 0;
        for(int i = 0; i <str.length; i++ ){
            if(str[i].equals("1")) {
                count++;
                continue;
            } 
           if( count%2 == 0){
               switch(i%2){
                   case 0:
                       answer += str[i];
                       break;
                   case 1:
                       break;
               }
           }
            if (count%2 ==1) {
                switch(i%2) {
                    case 0:
                        break;
                    case 1:
                        answer += str[i];
                        break;
                }
            }
        }
        if (answer.equals("") ) answer = "EMPTY";
        return answer;

    }
}