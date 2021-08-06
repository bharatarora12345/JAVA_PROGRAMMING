package codingNinjaCourse;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int p = 0;
        int q = 0;
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j =1 ; j <= n; j++) {
                if (t > j) {
                    System.out.print(" ");
                }
                else
                {
                    if (j == 1) {
                        System.out.print(" " + k);
                    }else {
                        int l = 1;
                        System.out.print(" " + (l + i));
                    }

                }
            }
            p++;
            q = p;
            System.out.println();
            t--;
        }
    }
}
