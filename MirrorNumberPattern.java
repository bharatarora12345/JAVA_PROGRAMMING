package codingNinjaCourse;

import java.util.Scanner;
import java.lang.*;
class MirrorNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-k ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            k+=2;
            System.out.println();
        }
    }
}