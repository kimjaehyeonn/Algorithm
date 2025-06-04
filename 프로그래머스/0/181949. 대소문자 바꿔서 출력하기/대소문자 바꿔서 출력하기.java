import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        
        char[] cha = a.toCharArray();
        String answer;
       for (char ch: cha) {
           if( Character.isLowerCase(ch) ) sb.append(Character.toUpperCase(ch));
           if(Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
       }
        System.out.println(sb);
        
        
    }
}