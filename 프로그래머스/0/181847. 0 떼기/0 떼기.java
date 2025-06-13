class Solution {
    public String solution(String n_str) {
        String answer = remove(n_str) ;
        return answer;
    }
    private String remove(String str) {
        if( str.startsWith("0")){
            str = str.substring(1,str.length());
            return remove(str);
        } else return str;
    
    }
}