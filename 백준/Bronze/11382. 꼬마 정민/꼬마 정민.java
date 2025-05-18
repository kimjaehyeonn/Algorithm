import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);
        
        System.out.println(a+b+c);
        sc.close();
    }
}