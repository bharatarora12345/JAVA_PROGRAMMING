package codingNinjaCourse;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = i ; j <= n; j++) {
                System.out.print((char)('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
