package codingNinjaCourse;

import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0,j = 0;
        int a = 0, b = 1;
        int t = 0;
        int sum = 0;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c++;
            j = c;
            while (j > 1) {
                b = b * 2;
                j--;
            }
            t = b * a;
            b = 1;
            sum = sum + t;
        }
        System.out.println(sum);
    }
}
