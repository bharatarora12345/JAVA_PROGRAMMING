package string2Darray;

import java.util.Scanner;

public class printSubSets {

    public static void printSubsets(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i <= j) {
                    System.out.println(s.substring(i, j + 1));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsets(s);
    }
}
