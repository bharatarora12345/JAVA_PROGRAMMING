package codingNinjaCourse;
import java.util.Scanner;

public class pattern4isoscles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                p++;
            }
            
            p = i-1;
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("*");
                p--;
            }
            System.out.println();

        }

    }
}
