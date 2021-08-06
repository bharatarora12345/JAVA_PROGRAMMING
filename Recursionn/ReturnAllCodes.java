package Recursion;

import java.util.Scanner;

public class ReturnAllCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        System.out.println(s);
        int c = 0;
        for (char i = 'a'; i < 'z' ; i++) {
            c = i;
            c++;
        }

        for (int i = 'a'; i < 'z'; i++) {
            System.out.print(c);
        }
    }
}
