package Recursion;

import java.util.Scanner;

public class CountZeros {
    public static int Countt(int a){
        int d = 0;
        if (a == 0){
            return d + 1;
        }if (a >= 1 && a <= 9){
            return d + 0;
        }
        int c = a % 10;
        if (c == 0){
            d++;
        }
        int small = Countt(a/10);
        return d+small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Countt(a));
    }
}
