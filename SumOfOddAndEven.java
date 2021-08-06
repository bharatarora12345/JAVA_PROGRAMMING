package codingNinjaCourse;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int N  = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int P = 0;
        while (N > 0)
        {
            P = N % 10;
            if (P % 2 == 0)
            {
                evenSum+= P;
            }
            else
            {
                oddSum+=P;
            }
            N = N / 10;
        }

        System.out.println("EvenSum :" + evenSum);
        System.out.println("OddSum :" + oddSum);


    }
}
