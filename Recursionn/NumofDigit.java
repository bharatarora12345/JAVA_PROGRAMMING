package Recursion;

import java.util.Scanner;

public class NumofDigit {
    public static int countt(int n){
        int c = 0;
        if (n > 0 && n < 10) {
            return 1;
        }
        c++;
        int small = countt(n/10);
        return c + small;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int count = countt(x);
        System.out.println(count);
    }
}
