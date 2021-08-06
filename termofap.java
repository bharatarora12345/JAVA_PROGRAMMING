package codingNinjaCourse;

import java.util.Scanner;

public class termofap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = x;
        for (int i = 1; i <= p; i++) {
            int n = 3*i+2;
            if (n % 4 != 0)
            {
                System.out.print(n + " ");
            }else{
                p++;
            }

        }
    }
}
