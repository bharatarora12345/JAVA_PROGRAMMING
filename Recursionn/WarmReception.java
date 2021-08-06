package Recursion;

import java.util.Scanner;

public class WarmReception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // no. of customers
        int n = sc.nextInt();
//        arrival timing
        int ar1[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }
        //Departure timining
        int ar2[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar2[i] = sc.nextInt();
        }
        //chair counts = c
        int c = 1;
        int a = ar1[0];
        int b = ar2[0];
        for (int i = 0; i < n; i++) {
            if (a > ar1[0] && b < ar2[i]){

            }
        }
    }
}
