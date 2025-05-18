
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A  = sc.nextInt();
        int B  = sc.nextInt();
        int c = B/100;
        int d = B/10 - c*10;
        int e = B - c*100 - d*10;
        System.out.println(A*e);
        System.out.println(A*d);
        System.out.println(A*c);
        System.out.println(A*B);
        sc.close();
    }
}