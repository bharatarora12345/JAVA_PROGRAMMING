package string2Darray;

import java.util.Scanner;

public class printPrefix {
    public static void printPrefixs(String s) {
        int c = 1;
        int a = s.length();
//        while (a > 0) {
//            for (int i = 0; i < c; i++) {
//                System.out.print(s.charAt(i));
//                c++;
//                i=0;
//                a--;
//            }
//            System.out.println();
//        }

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0,i+1));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1 = sc.nextLine();
        printPrefixs(s1);
    }
}
