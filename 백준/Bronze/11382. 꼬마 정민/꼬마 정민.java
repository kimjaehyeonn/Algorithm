import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();

        long a = Long.parseLong(input.split(" ")[0]);
        long b = Long.parseLong(input.split(" ")[1]);
        long c = Long.parseLong(input.split(" ")[2]);
        
        System.out.println(a+b+c);
        sc.close();
    }
}