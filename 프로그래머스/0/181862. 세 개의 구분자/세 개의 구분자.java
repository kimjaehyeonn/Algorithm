import java.util.*;
class Solution {
    public String[] solution(String myStr) {
       List<String> list = new ArrayList<>();
       String[] split = myStr.split("");
        int count =0;
        for (int i= 0; i<split.length; i++) {
            String st = "";
            for ( int j =i; j<split.length; j++ ){      
                if (split[j].equals("a")  ||split[j].equals("b") ||split[j].equals("c")) {  
                    break;
                } else if (!split[j].equals("a") &&  !split[j].equals("b")  && !split[j].equals("c") )  {
                    st += split[j];
                    i++;
                    
                } 
            }
            if (!st.equals("")) {list.add(st);}
        }
        String[] answer = list.size() == 0 ? new String[] {"EMPTY"} :  list.toArray(new String[0]);
        
        return answer;
    }
}