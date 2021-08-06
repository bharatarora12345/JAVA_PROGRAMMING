package codingNinjaCourse;

import javax.swing.*;
import java.util.Scanner;

public class Triangleofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1 ;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-k ; j++) {
                System.out.print(" ");
            }
            int p = i;
            int s = i+1;
            for (int j = 2*n-1-k; j < 2*n-1  ; j++) {
                System.out.print(p);
                if (p <= s) {
                    p+=1;
                }
                else {
                    p-=1;
                    s++;
                }
            }
            k+=2;
            System.out.println();
        }
    }
}
