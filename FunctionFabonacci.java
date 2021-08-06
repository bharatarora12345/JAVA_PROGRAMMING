package codingNinjaCourse;

import java.util.Scanner;

public class FunctionFabonacci {
    public static int fabonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fabonacci(n - 2) + fabonacci(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fabonacci(i) + " ");
        }
    }

}
