import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n%2!=0) {
            System.out.println(n+" is odd");
        } else {System.out.println(n + " is even");}
        sc.close();
    }
    
}