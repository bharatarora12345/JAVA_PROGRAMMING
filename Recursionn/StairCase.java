package Recursion;

import java.util.Scanner;

public class StairCase {
    public static int countStep(int n){
        int c = 0;
        if ((n == 0) || (n == 1)){
            return 1;
        }else if (n == 2){
            return 2;
        }
        else {
            return countStep(n-1) + countStep(n-2) + countStep(n-3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countStep(n));
    }
}
