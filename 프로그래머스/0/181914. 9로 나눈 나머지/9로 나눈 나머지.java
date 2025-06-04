class Solution {
    public int solution(String number) {
    char[] cha = number.toCharArray();
        int sum=0;
        for(char ch: cha) {
         sum+=ch -'0';
        } return sum%9;
    }}