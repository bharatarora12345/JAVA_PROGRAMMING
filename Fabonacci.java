package codingNinjaCourse;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Enter the number where you want to fabonacci");
        int ar[] = new int[15];
        ar[0] = 0;
        ar[1] = 1;
        for (int i = 0; i < N; i++) {
            if (i == 0)
            {
                System.out.print(ar[0] + " ");
            }
            else if ( i == 1)
            {
                System.out.println(ar[1] + " ");
            }
            else {
                i = ar[0] + ar[1];
                ar[0] = ar[1];
                ar[1] = i;
            }
        }
    }
}
