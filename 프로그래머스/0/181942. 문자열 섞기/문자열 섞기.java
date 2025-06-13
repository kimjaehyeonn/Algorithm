class Solution {
    public String solution(String str1, String str2) {
        String[] a = str1.split("");
        String[] b = str2.split("");
        String answer = "";
        for(int i=0;i<str1.length(); i++) {
            answer += a[i] + b[i];
        }
        return answer;
    }
}