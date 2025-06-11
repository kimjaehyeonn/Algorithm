class Solution {
    public int solution(String myString, String pat) {
        String[] string = myString.split("");
        String answer ="";
        for(String str : string) {
            str = (str.equals("A")) ? "B" : "A";
            answer+=str;
        }
        System.out.println(answer);
        return answer.contains(pat) ? 1 : 0;
    }
}