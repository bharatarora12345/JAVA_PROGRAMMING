package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int Summ(int n){
        if (n >= 1 && n <= 9){
            return n;
        }
        int c = n % 10;
        int smallAns = Summ(n/10);
        return c + smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Summ(num));
    }
}
