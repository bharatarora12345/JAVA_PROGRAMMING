package codingNinjaCourse;

import java.util.Scanner;

public class FindPowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number and Power :");
        int n = sc.nextInt();
        int pow = sc.nextInt();
        int output = 1;
        if (pow == 0)
        {
            pow = 1;
        }
        for (int i = 0; i < pow; i++) {
            output = output*n;
        }
        System.out.println("Num : " + n + " pow : " + pow + " output : " + output);
    }
}
