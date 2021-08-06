import java.util.Scanner;

public class Pattern6 {
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
            int q = 0;
            for (int j = 0; j < i; j++) {
                System.out.print(p);
                q+=p;
                p = p+q;
            }

            p = i-1;
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(p);
                p--;
            }
            System.out.println();

        }
    }
}
