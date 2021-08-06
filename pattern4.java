package codingNinjaCourse;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= (2*n-1) ; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int j = 1; j <= (2*n-1) ; j+=2) {
                System.out.print(p);
                p++;
            }
            System.out.println();

        }
    }
}
