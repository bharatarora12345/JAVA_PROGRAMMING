package codingNinjaCourse;

import java.util.Scanner;

public class sumorproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The used for a Number N");
        int n = sc.nextInt();
        System.out.println("Choice 1 or 2 or anyother");
        int c = sc.nextInt();
        if(c == 1)
        {
            int sum = 0;
            for (int i = n; i >= 0 ; i--) {
                sum+=i;
            }
            System.out.println(sum);
        }
        else if (c == 2)
        {
            int product = 1;
            for (int i = 10; i > 0 ; i--) {
                product*=i;
            }
            System.out.println(product);
        }
        else {
            System.out.println("-1");
        }
    }
}
