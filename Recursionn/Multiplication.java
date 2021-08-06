package Recursion;

import java.util.Scanner;

public class Multiplication {
    public static int Multi(int a , int b){
        if (a == 0 || b == 0){
            return 0;
        }if (a == 1){
            return b;
        }if (b == 1){
            return a;
        }
        int tempAns = Multi(a, b - 1);
        return a + tempAns;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Multi(a ,b));
    }
}
