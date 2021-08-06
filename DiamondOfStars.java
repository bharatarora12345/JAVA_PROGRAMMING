package codingNinjaCourse;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        for (int i = 0; i <= n/2; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = n/2; k >0; k--) {
            for (int j = 1; j <= n-k+2; j++) {
                System.out.print(" ");
            }
            for (int j = k; j >1; j--) {
                System.out.print("*");
            }
            for (int j = k; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}