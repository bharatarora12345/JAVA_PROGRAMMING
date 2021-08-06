package codingNinjaCourse;
//start
//read num
//i = 2 ((Divisor = 2))
//is divisor smalller than N2
//num % i == 0                     //num % i != 0
// print non prime number          //i=i+1
//end                              //is divisor smalller than N2
                                   // print prime

import java.util.Scanner;

//first enter the number which you want to check
public class FindPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 2; i < N; i++) {
            if (N % i == 0)
            {
                System.out.println("Non Prime");
                break;
            }
            else
            {
                System.out.println("Prime");
                break;
            }
        }
    }
}
