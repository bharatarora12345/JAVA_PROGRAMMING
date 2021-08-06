package codingNinjaCourse;
import java.util.Scanner;
import java.lang.*;
public class Gcd {
    public static void main(String[] args) {

        //first method
        int a = 55;
        int b = 121;
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("GCD of %d and %d is: %d", a, b, gcd);
    }

}
