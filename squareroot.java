package codingNinjaCourse;

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0;
        for (int i = 1; i <= n / 2; i++) {
            b = i * i;
            if (b == n) {
                System.out.print(i);
                break;
            }
            if (b > n){
                System.out.print(i-1);
                break;
            }
        }
    }
}
