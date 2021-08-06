package Recursion;

import java.util.Scanner;

public class xToThePwerN {
    public static int power(int x , int n){
        if (n == 1){
            return x;
        }
        int pwer = power(x , n-1);
        return x * pwer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }
}
